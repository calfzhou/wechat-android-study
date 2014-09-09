package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.z;

public final class o
{
  public static Bundle b(WXMediaMessage paramWXMediaMessage)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("_wxobject_sdkVer", paramWXMediaMessage.sdkVer);
    localBundle.putString("_wxobject_title", paramWXMediaMessage.title);
    localBundle.putString("_wxobject_description", paramWXMediaMessage.description);
    localBundle.putByteArray("_wxobject_thumbdata", paramWXMediaMessage.thumbData);
    String str;
    if (paramWXMediaMessage.mediaObject != null)
    {
      str = paramWXMediaMessage.mediaObject.getClass().getName();
      if ((str != null) && (str.length() != 0))
        break label133;
      z.e("!44@/B4Tb64lLpLZi//yCy0pIMPDmNPaWlODLwNV6cb1AHk=", "pathNewToOld fail, newPath is null");
    }
    while (true)
    {
      localBundle.putString("_wxobject_identifier_", str);
      paramWXMediaMessage.mediaObject.serialize(localBundle);
      localBundle.putString("_wxobject_mediatagname", paramWXMediaMessage.mediaTagName);
      localBundle.putString("_wxobject_message_action", paramWXMediaMessage.messageAction);
      localBundle.putString("_wxobject_message_ext", paramWXMediaMessage.messageExt);
      return localBundle;
      label133: str = str.replace("com.tencent.mm.sdk.modelmsg", "com.tencent.mm.sdk.openapi");
    }
  }

  public static WXMediaMessage w(Bundle paramBundle)
  {
    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
    localWXMediaMessage.sdkVer = paramBundle.getInt("_wxobject_sdkVer");
    localWXMediaMessage.title = paramBundle.getString("_wxobject_title");
    localWXMediaMessage.description = paramBundle.getString("_wxobject_description");
    localWXMediaMessage.thumbData = paramBundle.getByteArray("_wxobject_thumbdata");
    localWXMediaMessage.mediaTagName = paramBundle.getString("_wxobject_mediatagname");
    localWXMediaMessage.messageAction = paramBundle.getString("_wxobject_message_action");
    localWXMediaMessage.messageExt = paramBundle.getString("_wxobject_message_ext");
    String str1 = paramBundle.getString("_wxobject_identifier_");
    if ((str1 == null) || (str1.length() == 0))
      z.e("!44@/B4Tb64lLpLZi//yCy0pIMPDmNPaWlODLwNV6cb1AHk=", "pathOldToNew fail, oldPath is null");
    for (String str2 = str1; (str2 == null) || (str2.length() <= 0); str2 = str1.replace("com.tencent.mm.sdk.openapi", "com.tencent.mm.sdk.modelmsg"))
      return localWXMediaMessage;
    try
    {
      localWXMediaMessage.mediaObject = ((p)Class.forName(str2).newInstance());
      localWXMediaMessage.mediaObject.unserialize(paramBundle);
      return localWXMediaMessage;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpLZi//yCy0pIMPDmNPaWlODLwNV6cb1AHk=", "get media object from bundle failed: unknown ident " + str2 + ", ex = " + localException.getMessage());
    }
    return localWXMediaMessage;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.modelmsg.o
 * JD-Core Version:    0.6.2
 */