package com.tencent.mm.modelcdntran;

public class keep_ProgressInfo
{
  public int field_finishedLength;
  public boolean field_mtlnotify;
  public int field_status;
  public int field_toltalLength;
  public String mediaId;

  public String toString()
  {
    Object[] arrayOfObject = new Object[5];
    arrayOfObject[0] = this.mediaId;
    arrayOfObject[1] = Integer.valueOf(this.field_toltalLength);
    arrayOfObject[2] = Integer.valueOf(this.field_finishedLength);
    arrayOfObject[3] = Integer.valueOf(this.field_status);
    arrayOfObject[4] = Boolean.valueOf(this.field_mtlnotify);
    return String.format("id:%s total:%d finLen:%d status:%d,mtl:%b", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelcdntran.keep_ProgressInfo
 * JD-Core Version:    0.6.2
 */