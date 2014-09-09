package com.tencent.mm.jni.platformcomm;

import android.content.Context;
import com.tencent.mm.sdk.platformtools.cm;

public final class PlatformComm
{
  private static Context context = null;
  public static f dQS = null;
  private static cm gQj = null;

  public static void a(Context paramContext, cm paramcm)
  {
    context = paramContext;
    gQj = paramcm;
    c.aa(paramContext);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.jni.platformcomm.PlatformComm
 * JD-Core Version:    0.6.2
 */