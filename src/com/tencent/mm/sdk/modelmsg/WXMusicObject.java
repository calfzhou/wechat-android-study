package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.z;

public class WXMusicObject
  implements p
{
  private static final int LENGTH_LIMIT = 10240;
  private static final String TAG = "!44@/B4Tb64lLpLZi//yCy0pIDS5SYYe7sSOkAic0iTiIGs=";
  public String musicDataUrl;
  public String musicLowBandDataUrl;
  public String musicLowBandUrl;
  public String musicUrl;

  public boolean checkArgs()
  {
    if (((this.musicUrl == null) || (this.musicUrl.length() == 0)) && ((this.musicLowBandUrl == null) || (this.musicLowBandUrl.length() == 0)))
    {
      z.e("!44@/B4Tb64lLpLZi//yCy0pIDS5SYYe7sSOkAic0iTiIGs=", "both arguments are null");
      return false;
    }
    if ((this.musicUrl != null) && (this.musicUrl.length() > 10240))
    {
      z.e("!44@/B4Tb64lLpLZi//yCy0pIDS5SYYe7sSOkAic0iTiIGs=", "checkArgs fail, musicUrl is too long");
      return false;
    }
    if ((this.musicLowBandUrl != null) && (this.musicLowBandUrl.length() > 10240))
    {
      z.e("!44@/B4Tb64lLpLZi//yCy0pIDS5SYYe7sSOkAic0iTiIGs=", "checkArgs fail, musicLowBandUrl is too long");
      return false;
    }
    return true;
  }

  public void serialize(Bundle paramBundle)
  {
    paramBundle.putString("_wxmusicobject_musicUrl", this.musicUrl);
    paramBundle.putString("_wxmusicobject_musicLowBandUrl", this.musicLowBandUrl);
    paramBundle.putString("_wxmusicobject_musicDataUrl", this.musicDataUrl);
    paramBundle.putString("_wxmusicobject_musicLowBandDataUrl", this.musicLowBandDataUrl);
  }

  public int type()
  {
    return 3;
  }

  public void unserialize(Bundle paramBundle)
  {
    this.musicUrl = paramBundle.getString("_wxmusicobject_musicUrl");
    this.musicLowBandUrl = paramBundle.getString("_wxmusicobject_musicLowBandUrl");
    this.musicDataUrl = paramBundle.getString("_wxmusicobject_musicDataUrl");
    this.musicLowBandDataUrl = paramBundle.getString("_wxmusicobject_musicLowBandDataUrl");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.modelmsg.WXMusicObject
 * JD-Core Version:    0.6.2
 */