package com.tencent.kingkong;

public final class CharArrayBuffer
{
  public char[] data;
  public int sizeCopied;

  public CharArrayBuffer(int paramInt)
  {
    this.data = new char[paramInt];
  }

  public CharArrayBuffer(char[] paramArrayOfChar)
  {
    this.data = paramArrayOfChar;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.CharArrayBuffer
 * JD-Core Version:    0.6.2
 */