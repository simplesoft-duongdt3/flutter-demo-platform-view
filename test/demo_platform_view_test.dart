import 'package:flutter/services.dart';
import 'package:flutter_test/flutter_test.dart';
import 'package:demo_platform_view/demo_platform_view.dart';

void main() {
  const MethodChannel channel = MethodChannel('demo_platform_view');

  TestWidgetsFlutterBinding.ensureInitialized();

  setUp(() {
    channel.setMockMethodCallHandler((MethodCall methodCall) async {
      return '42';
    });
  });

  tearDown(() {
    channel.setMockMethodCallHandler(null);
  });

  test('getPlatformVersion', () async {
    expect(await DemoPlatformView.platformVersion, '42');
  });
}
