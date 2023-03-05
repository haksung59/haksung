import 'package:flutter/material.dart';
import 'package:flutter_toonflix/models/response_model.dart';

import '../models/webtoon_model.dart';
import '../services/api_service.dart';

class HomeScreen extends StatelessWidget {
  HomeScreen({super.key});

  // Future<List<WebtoonModel>> webtoons = ApiService.getTodaysToons();
  Future<ResponseModel> response = ApiService.getTodaysToons();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.white,
      appBar: AppBar(
        elevation: 2,
        backgroundColor: Colors.white,
        foregroundColor: Colors.green,
        title: const Text(
          '오늘의 웹툰',
          style: TextStyle(
            fontSize: 24,
            fontWeight: FontWeight.w400,
          ),
        ),
      ),
      body: FutureBuilder(
        future: response,
        builder: (context, snapshot) {
          if (snapshot.hasData) {
            return Text("There is data!");
          }
          return Text('Loading...');
        },
      ),
    );
  }
}
