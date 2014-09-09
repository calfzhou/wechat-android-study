package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

public class WXEmojiObject
  implements p
{
  private static final int CONTENT_LENGTH_LIMIT = 10485760;
  private static final String TAG = "!44@/B4Tb64lLpKbvaoYwgBifwJtObW4pYnf2Gs+DAkLhRM=";
  public byte[] emojiData;
  public String emojiPath;

  public WXEmojiObject()
  {
    this.emojiData = null;
    this.emojiPath = null;
  }

  public WXEmojiObject(String paramString)
  {
    this.emojiPath = paramString;
  }

  public WXEmojiObject(byte[] paramArrayOfByte)
  {
    this.emojiData = paramArrayOfByte;
  }

  private int getFileSize(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0));
    File localFile;
    do
    {
      return 0;
      localFile = new File(paramString);
    }
    while (!localFile.exists());
    return (int)localFile.length();
  }

  public boolean checkArgs()
  {
    if (((this.emojiData == null) || (this.emojiData.length == 0)) && ((this.emojiPath == null) || (this.emojiPath.length() == 0)))
    {
      z.e("!44@/B4Tb64lLpKbvaoYwgBifwJtObW4pYnf2Gs+DAkLhRM=", "checkArgs fail, both arguments is null");
      return false;
    }
    if ((this.emojiData != null) && (this.emojiData.length > 10485760))
    {
      z.e("!44@/B4Tb64lLpKbvaoYwgBifwJtObW4pYnf2Gs+DAkLhRM=", "checkArgs fail, emojiData is too large");
      return false;
    }
    if ((this.emojiPath != null) && (getFileSize(this.emojiPath) > 10485760))
    {
      z.e("!44@/B4Tb64lLpKbvaoYwgBifwJtObW4pYnf2Gs+DAkLhRM=", "checkArgs fail, emojiSize is too large");
      return false;
    }
    return true;
  }

  public void serialize(Bundle paramBundle)
  {
    paramBundle.putByteArray("_wxemojiobject_emojiData", this.emojiData);
    paramBundle.putString("_wxemojiobject_emojiPath", this.emojiPath);
  }

  public void setEmojiData(byte[] paramArrayOfByte)
  {
    this.emojiData = paramArrayOfByte;
  }

  public void setEmojiPath(String paramString)
  {
    this.emojiPath = paramString;
  }

  public int type()
  {
    return 8;
  }

  public void unserialize(Bundle paramBundle)
  {
    this.emojiData = paramBundle.getByteArray("_wxemojiobject_emojiData");
    this.emojiPath = paramBundle.getString("_wxemojiobject_emojiPath");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.modelmsg.WXEmojiObject
 * JD-Core Version:    0.6.2
 */