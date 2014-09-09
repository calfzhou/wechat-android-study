package com.tencent.mm.modelcdntran;

import com.tencent.mm.sdk.platformtools.ch;

public class keep_SceneResult
{
  protected static final char[] hexArray = "0123456789ABCDEF".toCharArray();
  public String dummyvalue = ",,,,,,";
  public int field_UploadHitCacheType = 0;
  public String field_aesKey;
  public String field_arg;
  public String field_argInfo;
  public String field_fileId;
  public int field_fileLength;
  public int field_midimgLength;
  public boolean field_needSendMsgField = true;
  public int field_retCode;
  public byte[] field_sKeyrespbuf;
  public int field_thumbimgLength;
  public String field_toUser;
  public String field_transInfo;
  public String field_videoFileId;
  public String mediaId;
  public String report_Part2 = "";

  private String bytesToHex(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar = new char[2 * paramArrayOfByte.length];
    for (int i = 0; i < paramArrayOfByte.length; i++)
    {
      int j = 0xFF & paramArrayOfByte[i];
      arrayOfChar[(i * 2)] = hexArray[(j >>> 4)];
      arrayOfChar[(1 + i * 2)] = hexArray[(j & 0xF)];
    }
    return new String(arrayOfChar);
  }

  public String toString()
  {
    Object[] arrayOfObject1 = new Object[15];
    arrayOfObject1[0] = this.mediaId;
    arrayOfObject1[1] = this.field_fileId;
    arrayOfObject1[2] = Integer.valueOf(ch.ja(this.field_aesKey).length());
    arrayOfObject1[3] = Integer.valueOf(this.field_fileLength);
    arrayOfObject1[4] = Integer.valueOf(this.field_midimgLength);
    arrayOfObject1[5] = Integer.valueOf(this.field_thumbimgLength);
    arrayOfObject1[6] = this.field_transInfo;
    arrayOfObject1[7] = Integer.valueOf(this.field_retCode);
    arrayOfObject1[8] = this.field_toUser;
    arrayOfObject1[9] = this.field_arg;
    arrayOfObject1[10] = this.field_videoFileId;
    arrayOfObject1[11] = this.field_argInfo;
    arrayOfObject1[12] = Integer.valueOf(this.field_UploadHitCacheType);
    arrayOfObject1[13] = Boolean.valueOf(this.field_needSendMsgField);
    arrayOfObject1[14] = Integer.valueOf(0);
    String str = String.format("id:%s file:%s aeskey:%d filelen:%d midlen:%d thlen:%d transInfo:%s retCode:%d toUser:%s arg:%s videoFileId:%s argInfo:%s hitcache:%d needsend:%b msgid:%d", arrayOfObject1);
    if (this.field_sKeyrespbuf != null)
    {
      StringBuilder localStringBuilder = new StringBuilder().append(str);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = bytesToHex(this.field_sKeyrespbuf);
      str = String.format("skeyrespbuf:%s", arrayOfObject2);
    }
    return str;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelcdntran.keep_SceneResult
 * JD-Core Version:    0.6.2
 */