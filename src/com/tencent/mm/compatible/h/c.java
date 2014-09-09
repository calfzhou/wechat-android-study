package com.tencent.mm.compatible.h;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.tencent.mm.compatible.a.a;

public final class c
{
  public static boolean b(Activity paramActivity, int paramInt)
  {
    Intent localIntent = new Intent("android.media.action.VIDEO_CAPTURE");
    localIntent.putExtra("android.intent.extra.videoQuality", 0);
    a.a(8, new d(localIntent));
    try
    {
      paramActivity.startActivityForResult(localIntent, 4372);
      return true;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
    }
    return false;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.h.c
 * JD-Core Version:    0.6.2
 */