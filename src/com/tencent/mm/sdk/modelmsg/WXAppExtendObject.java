package com.tencent.mm.sdk.modelmsg;

import android.os.Bundle;
import com.tencent.mm.sdk.platformtools.z;
import java.io.File;

public class WXAppExtendObject
  implements p
{
  private static final int CONTENT_LENGTH_LIMIT = 10485760;
  private static final int EXTINFO_LENGTH_LIMIT = 2048;
  private static final int PATH_LENGTH_LIMIT = 10240;
  private static final String TAG = "!44@/B4Tb64lLpKAJT9Dy02QpkEMwHvIJwTozDg5bJjC4PI=";
  public String extInfo;
  public byte[] fileData;
  public String filePath;

  public WXAppExtendObject()
  {
  }

  public WXAppExtendObject(String paramString1, String paramString2)
  {
    this.extInfo = paramString1;
    this.filePath = paramString2;
  }

  public WXAppExtendObject(String paramString, byte[] paramArrayOfByte)
  {
    this.extInfo = paramString;
    this.fileData = paramArrayOfByte;
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
    if (((this.extInfo == null) || (this.extInfo.length() == 0)) && ((this.filePath == null) || (this.filePath.length() == 0)) && ((this.fileData == null) || (this.fileData.length == 0)))
    {
      z.e("!44@/B4Tb64lLpKAJT9Dy02QpkEMwHvIJwTozDg5bJjC4PI=", "checkArgs fail, all arguments is null");
      return false;
    }
    if ((this.extInfo != null) && (this.extInfo.length() > 2048))
    {
      z.e("!44@/B4Tb64lLpKAJT9Dy02QpkEMwHvIJwTozDg5bJjC4PI=", "checkArgs fail, extInfo is invalid");
      return false;
    }
    if ((this.filePath != null) && (this.filePath.length() > 10240))
    {
      z.e("!44@/B4Tb64lLpKAJT9Dy02QpkEMwHvIJwTozDg5bJjC4PI=", "checkArgs fail, filePath is invalid");
      return false;
    }
    if ((this.filePath != null) && (getFileSize(this.filePath) > 10485760))
    {
      z.e("!44@/B4Tb64lLpKAJT9Dy02QpkEMwHvIJwTozDg5bJjC4PI=", "checkArgs fail, fileSize is too large");
      return false;
    }
    if ((this.fileData != null) && (this.fileData.length > 10485760))
    {
      z.e("!44@/B4Tb64lLpKAJT9Dy02QpkEMwHvIJwTozDg5bJjC4PI=", "checkArgs fail, fileData is too large");
      return false;
    }
    return true;
  }

  public void serialize(Bundle paramBundle)
  {
    paramBundle.putString("_wxappextendobject_extInfo", this.extInfo);
    paramBundle.putByteArray("_wxappextendobject_fileData", this.fileData);
    paramBundle.putString("_wxappextendobject_filePath", this.filePath);
  }

  public int type()
  {
    return 7;
  }

  public void unserialize(Bundle paramBundle)
  {
    this.extInfo = paramBundle.getString("_wxappextendobject_extInfo");
    this.fileData = paramBundle.getByteArray("_wxappextendobject_fileData");
    this.filePath = paramBundle.getString("_wxappextendobject_filePath");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.modelmsg.WXAppExtendObject
 * JD-Core Version:    0.6.2
 */