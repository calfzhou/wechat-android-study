package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.z;

public class WXWebpageObject
  implements p
{
  private static final int LENGTH_LIMIT = 10240;
  private static final String TAG = "!44@/B4Tb64lLpI5xTkrII12QyxP0GmFMufcOhP+yzzJUyY=";
  public String extInfo;
  public String webpageUrl;

  public WXWebpageObject()
  {
  }

  public WXWebpageObject(String paramString)
  {
    this.webpageUrl = paramString;
  }

  public boolean checkArgs()
  {
    if ((this.webpageUrl == null) || (this.webpageUrl.length() == 0) || (this.webpageUrl.length() > 10240))
    {
      z.e("!44@/B4Tb64lLpI5xTkrII12QyxP0GmFMufcOhP+yzzJUyY=", "checkArgs fail, webpageUrl is invalid");
      return false;
    }
    return true;
  }

  public void serialize(Bundle paramBundle)
  {
    paramBundle.putString("_wxwebpageobject_extInfo", this.extInfo);
    paramBundle.putString("_wxwebpageobject_webpageUrl", this.webpageUrl);
  }

  public int type()
  {
    return 5;
  }

  public void unserialize(Bundle paramBundle)
  {
    this.extInfo = paramBundle.getString("_wxwebpageobject_extInfo");
    this.webpageUrl = paramBundle.getString("_wxwebpageobject_webpageUrl");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.modelmsg.WXWebpageObject
 * JD-Core Version:    0.6.2
 */