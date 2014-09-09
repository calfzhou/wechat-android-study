package com.tencent.mm.sdk.modelmsg;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.sdk.platformtools.z;
import java.io.ByteArrayOutputStream;

public final class WXMediaMessage
{
  public static final String ACTION_WXAPPMESSAGE = "com.tencent.mm.sdk.openapi.Intent.ACTION_WXAPPMESSAGE";
  private static final int DESCRIPTION_LENGTH_LIMIT = 1024;
  private static final int MEDIA_TAG_NAME_LENGTH_LIMIT = 64;
  private static final int MESSAGE_ACTION_LENGTH_LIMIT = 2048;
  private static final int MESSAGE_EXT_LENGTH_LIMIT = 2048;
  private static final String TAG = "!44@/B4Tb64lLpLZi//yCy0pIMPDmNPaWlODLwNV6cb1AHk=";
  public static final int THUMB_LENGTH_LIMIT = 32768;
  private static final int TITLE_LENGTH_LIMIT = 512;
  public String description;
  public p mediaObject;
  public String mediaTagName;
  public String messageAction;
  public String messageExt;
  public int sdkVer;
  public byte[] thumbData;
  public String title;

  public WXMediaMessage()
  {
    this(null);
  }

  public WXMediaMessage(p paramp)
  {
    this.mediaObject = paramp;
  }

  final boolean checkArgs()
  {
    if ((getType() == 8) && ((this.thumbData == null) || (this.thumbData.length == 0)))
    {
      z.e("!44@/B4Tb64lLpLZi//yCy0pIMPDmNPaWlODLwNV6cb1AHk=", "checkArgs fail, thumbData should not be null when send emoji");
      return false;
    }
    if ((this.thumbData != null) && (this.thumbData.length > 32768))
    {
      z.e("!44@/B4Tb64lLpLZi//yCy0pIMPDmNPaWlODLwNV6cb1AHk=", "checkArgs fail, thumbData is invalid");
      return false;
    }
    if ((this.title != null) && (this.title.length() > 512))
    {
      z.e("!44@/B4Tb64lLpLZi//yCy0pIMPDmNPaWlODLwNV6cb1AHk=", "checkArgs fail, title is invalid");
      return false;
    }
    if ((this.description != null) && (this.description.length() > 1024))
    {
      z.e("!44@/B4Tb64lLpLZi//yCy0pIMPDmNPaWlODLwNV6cb1AHk=", "checkArgs fail, description is invalid");
      return false;
    }
    if (this.mediaObject == null)
    {
      z.e("!44@/B4Tb64lLpLZi//yCy0pIMPDmNPaWlODLwNV6cb1AHk=", "checkArgs fail, mediaObject is null");
      return false;
    }
    if ((this.mediaTagName != null) && (this.mediaTagName.length() > 64))
    {
      z.e("!44@/B4Tb64lLpLZi//yCy0pIMPDmNPaWlODLwNV6cb1AHk=", "checkArgs fail, mediaTagName is too long");
      return false;
    }
    if ((this.messageAction != null) && (this.messageAction.length() > 2048))
    {
      z.e("!44@/B4Tb64lLpLZi//yCy0pIMPDmNPaWlODLwNV6cb1AHk=", "checkArgs fail, messageAction is too long");
      return false;
    }
    if ((this.messageExt != null) && (this.messageExt.length() > 2048))
    {
      z.e("!44@/B4Tb64lLpLZi//yCy0pIMPDmNPaWlODLwNV6cb1AHk=", "checkArgs fail, messageExt is too long");
      return false;
    }
    return this.mediaObject.checkArgs();
  }

  public final int getType()
  {
    if (this.mediaObject == null)
      return 0;
    return this.mediaObject.type();
  }

  public final void setThumbImage(Bitmap paramBitmap)
  {
    try
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramBitmap.compress(Bitmap.CompressFormat.JPEG, 85, localByteArrayOutputStream);
      this.thumbData = localByteArrayOutputStream.toByteArray();
      localByteArrayOutputStream.close();
      return;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpLZi//yCy0pIMPDmNPaWlODLwNV6cb1AHk=", "put thumb failed");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.modelmsg.WXMediaMessage
 * JD-Core Version:    0.6.2
 */