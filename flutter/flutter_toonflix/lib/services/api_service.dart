import 'package:flutter/foundation.dart';
import 'package:http/http.dart' as http;

class ApiService {
  final String baseUrl = "https://webtoon-crawler.nomadcoders.workers.dev/";
  final String today = "today";

  void getTodaysToons() async {
    // final url = Uri.parse('$baseUrl/$today');
    var url = Uri.parse(
        'http://localhost:8080/api/v1/user/all/doubleCheck?userId=haksung59');
    final response = await http.get(url);

    if (response.statusCode == 200) {
      if (kDebugMode) {
        print('hihihi');
        print(response.body);
      }
      return;
    }
    throw Error();
  }
}
