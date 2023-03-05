class ResponseModel {
  final String code, message;

  ResponseModel.fromJson(Map<String, dynamic> json)
      : code = json['code'],
        message = json['message'];
}
