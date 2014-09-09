package com.tencent.smtt.sdk;

import android.webkit.GeolocationPermissions.Callback;
import com.tencent.smtt.export.external.interfaces.GeolocationPermissionsCallback;

final class s
  implements GeolocationPermissionsCallback
{
  GeolocationPermissions.Callback kep;

  s(SystemWebChromeClient paramSystemWebChromeClient, GeolocationPermissions.Callback paramCallback)
  {
    this.kep = paramCallback;
  }

  public final void invoke(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.kep.invoke(paramString, paramBoolean1, paramBoolean2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.s
 * JD-Core Version:    0.6.2
 */