import 'dart:convert';

import 'package:flutter/foundation.dart';
import 'package:flutter_toonflix/models/response_model.dart';
import 'package:flutter_toonflix/models/webtoon_model.dart';
import 'package:http/http.dart' as http;

class ApiService {
  static final String baseUrl =
      "https://webtoon-crawler.nomadcoders.workers.dev/";
  static final String today = "today";

  // Future<List<WebtoonModel>> getTodaysToons() async {
  static Future<ResponseModel> getTodaysToons() async {
    // List<WebtoonModel> webtoonInstances = [];
    ResponseModel responseInstance;
    // final url = Uri.parse('$baseUrl/$today');
    var url = Uri.parse(
        'http://localhost:8080/api/v1/user/all/doubleCheck?userId=haksung59');
    final response = await http.get(url);

    if (response.statusCode == 200) {
      final dynamic webtoons = jsonDecode(response.body);

      // for (var webtoon in webtoons) {
      //   final List<dynamic> webtoons = jsonDecode(response.body);
      //   webtoonInstances.add(WebtoonModel.fromJson(webtoon));
      // }
      responseInstance = ResponseModel.fromJson(webtoons);

      // return webtoonInstances;
      print(responseInstance.message);

      return responseInstance;
    }
    throw Error();
  }
}
