package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.z;

public class WXVideoObject
  implements p
{
  private static final int LENGTH_LIMIT = 10240;
  private static final String TAG = "!44@/B4Tb64lLpJzNFkXfnMUR98Xd/IsQLrYLUyRWBhcjoc=";
  public String videoLowBandUrl;
  public String videoUrl;

  public boolean checkArgs()
  {
    if (((this.videoUrl == null) || (this.videoUrl.length() == 0)) && ((this.videoLowBandUrl == null) || (this.videoLowBandUrl.length() == 0)))
    {
      z.e("!44@/B4Tb64lLpJzNFkXfnMUR98Xd/IsQLrYLUyRWBhcjoc=", "both arguments are null");
      return false;
    }
    if ((this.videoUrl != null) && (this.videoUrl.length() > 10240))
    {
      z.e("!44@/B4Tb64lLpJzNFkXfnMUR98Xd/IsQLrYLUyRWBhcjoc=", "checkArgs fail, videoUrl is too long");
      return false;
    }
    if ((this.videoLowBandUrl != null) && (this.videoLowBandUrl.length() > 10240))
    {
      z.e("!44@/B4Tb64lLpJzNFkXfnMUR98Xd/IsQLrYLUyRWBhcjoc=", "checkArgs fail, videoLowBandUrl is too long");
      return false;
    }
    return true;
  }

  public void serialize(Bundle paramBundle)
  {
    paramBundle.putString("_wxvideoobject_videoUrl", this.videoUrl);
    paramBundle.putString("_wxvideoobject_videoLowBandUrl", this.videoLowBandUrl);
  }

  public int type()
  {
    return 4;
  }

  public void unserialize(Bundle paramBundle)
  {
    this.videoUrl = paramBundle.getString("_wxvideoobject_videoUrl");
    this.videoLowBandUrl = paramBundle.getString("_wxvideoobject_videoLowBandUrl");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.modelmsg.WXVideoObject
 * JD-Core Version:    0.6.2
 */