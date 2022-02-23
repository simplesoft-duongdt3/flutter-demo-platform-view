#import "DemoPlatformViewPlugin.h"
#if __has_include(<demo_platform_view/demo_platform_view-Swift.h>)
#import <demo_platform_view/demo_platform_view-Swift.h>
#else
// Support project import fallback if the generated compatibility header
// is not copied when this plugin is created as a library.
// https://forums.swift.org/t/swift-static-libraries-dont-copy-generated-objective-c-header/19816
#import "demo_platform_view-Swift.h"
#endif

@implementation DemoPlatformViewPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftDemoPlatformViewPlugin registerWithRegistrar:registrar];
}
@end
