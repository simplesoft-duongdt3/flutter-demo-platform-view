
import 'dart:async';

import 'package:flutter/services.dart';

class DemoPlatformView {
  static const MethodChannel _channel = MethodChannel('demo_platform_view');

  static Future<String?> get platformVersion async {
    final String? version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
