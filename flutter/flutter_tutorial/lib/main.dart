import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class ParentWidget extends StatefulWidget {
  const ParentWidget({super.key});

  @override
  State<ParentWidget> createState() => _ParentWidgetState();
}

class _ParentWidgetState extends State<ParentWidget> {
  bool _active = false;

  void _handleTapboxChanged(bool newValue) {
    setState(() {
      _active = newValue;
    });
  }

  @override
  Widget build(BuildContext context) {
    return SizedBox(
      child: TapboxB(
        active: _active,
        onChanged: _handleTapboxChanged,
      ),
    );
  }
}

class TapboxB extends StatelessWidget {
  const TapboxB({
    super.key,
    this.active = false,
    required this.onChanged,
  });

  final bool active;
  final ValueChanged<bool> onChanged;

  void _handleTap() {
    onChanged(!active);
  }

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: _handleTap,
      child: Container(
        width: 200.0,
        height: 200.0,
        decoration: BoxDecoration(
          color: active ? Colors.lightGreen[700] : Colors.grey[600],
        ),
        child: Center(
          child: Text(
            active ? 'Active' : 'Inactive',
            style: const TextStyle(fontSize: 32.0, color: Colors.white),
          ),
        ),
      ),
    );
  }
}

class TapboxA extends StatefulWidget {
  const TapboxA({super.key});

  @override
  State<TapboxA> createState() => _TapboxAState();
}

class _TapboxAState extends State<TapboxA> {
  bool _active = false;

  void _handleTap() {
    setState(() {
      _active = !_active;
    });
  }

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: _handleTap,
      child: Container(
        width: 200.0,
        height: 200.0,
        decoration: BoxDecoration(
          color: _active ? Colors.lightGreen[700] : Colors.grey[600],
        ),
        child: Center(
          child: Text(
            _active ? 'Active' : 'Inactive',
            style: const TextStyle(fontSize: 32.0, color: Colors.white),
          ),
        ),
      ),
    );
  }
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Tutorial',
      home: Scaffold(
          appBar: AppBar(
            title: const Text('Flutter Tutorial'),
          ),
          body: const Center(
            child: TapboxA(),
          )
      ),
    );
  }

  // @override
  // Widget build(BuildContext context) {
  //   Widget titleSection = Container(
  //     padding: const EdgeInsets.all(32),
  //     child: Row(
  //       children: [
  //         Expanded(
  //           /*1*/
  //           child: Column(
  //             crossAxisAlignment: CrossAxisAlignment.start,
  //             children: [
  //               /*2*/
  //               Container(
  //                 padding: const EdgeInsets.only(bottom: 8),
  //                 child: const Text(
  //                   'Oeschinen Lake Campground',
  //                   style: TextStyle(
  //                     fontWeight: FontWeight.bold,
  //                   ),
  //                 ),
  //               ),
  //               Text(
  //                 'Kandersteg, Switzerland',
  //                 style: TextStyle(
  //                   color: Colors.grey[500],
  //                 ),
  //               ),
  //             ],
  //           ),
  //         ),
  //         /*3*/
  //         const FavoriteWidget(),
  //       ],
  //     ),
  //   );
  //   Color color = Theme.of(context).primaryColor;
  //
  //   Widget buttonSection = Row(
  //     mainAxisAlignment: MainAxisAlignment.spaceEvenly,
  //     children: [
  //       _buildButtonColumn(color, Icons.call, 'CALL'),
  //       _buildButtonColumn(color, Icons.near_me, 'ROUTE'),
  //       _buildButtonColumn(color, Icons.share, 'SHARE'),
  //     ],
  //   );
  //
  //   Widget textSection = const Padding(
  //     padding: EdgeInsets.all(32),
  //     child: Text(
  //       'Lake Oeschinen lies at the foot of the Blüemlisalp in the Bernese '
  //           'Alps. Situated 1,578 meters above sea level, it is one of the '
  //           'larger Alpine Lakes. A gondola ride from Kandersteg, followed by a '
  //           'half-hour walk through pastures and pine forest, leads you to the '
  //           'lake, which warms to 20 degrees Celsius in the summer. Activities '
  //           'enjoyed here include rowing, and riding the summer toboggan run.',
  //       softWrap: true,
  //     ),
  //   );
  //
  //   return MaterialApp(
  //     title: 'Flutter Tutorial',
  //     home: Scaffold(
  //       appBar: AppBar(
  //         title: const Text('Flutter Tutorial'),
  //       ),
  //       body: ListView(
  //         children: [
  //           Image.asset(
  //             'images/lake.jpg',
  //             width: 600,
  //             height: 240,
  //             fit: BoxFit.cover,
  //           ),
  //           titleSection,
  //           buttonSection,
  //           textSection,
  //         ],
  //       ),
  //     )
  //   );
  // }

  Column _buildButtonColumn(Color color, IconData icon, String label) {
    return Column(
      mainAxisSize: MainAxisSize.min,
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        Icon(icon, color: color),
        Container(
          margin: const EdgeInsets.only(top: 8),
          child: Text(
            label,
            style: TextStyle(
              fontSize: 12,
              fontWeight: FontWeight.w400,
              color: color,
            ),
          ),
        ),
      ],
    );
  }
}

class FavoriteWidget extends StatefulWidget {
  const FavoriteWidget({super.key});

  @override
  State<FavoriteWidget> createState() => _FavoriteWidgetState();

}

class _FavoriteWidgetState extends State<FavoriteWidget>{
  bool _isFavorited = true;
  int _favoriteCount = 41;

  @override
  Widget build(BuildContext context) {
    void _toggleFavorite() {
      setState(() {
        if (_isFavorited) {
          _favoriteCount -= 1;
          _isFavorited = false;
        } else {
          _favoriteCount += 1;
          _isFavorited = true;
        }
      });
    }
    return Row(
      mainAxisSize: MainAxisSize.min,
      children: [
        Container(
          padding: const EdgeInsets.all(0),
          child: IconButton(
            padding: const EdgeInsets.all(0),
            alignment: Alignment.centerRight,
            icon: (_isFavorited
                ? const Icon(Icons.star)
                : const Icon(Icons.star_border)),
            color: Colors.red[500],
            onPressed: _toggleFavorite,
          ),
        ),
        SizedBox(
          width: 18,
          child: SizedBox(
            child: Text('$_favoriteCount'),
          ),
        ),
      ],
    );
  }
}