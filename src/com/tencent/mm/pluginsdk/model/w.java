package com.tencent.mm.pluginsdk.model;

public final class w
{
  int LN;
  int w;
  int x;
  int y;

  public final String toString()
  {
    Object[] arrayOfObject = new Object[4];
    arrayOfObject[0] = Integer.valueOf(this.x);
    arrayOfObject[1] = Integer.valueOf(this.y);
    arrayOfObject[2] = Integer.valueOf(this.LN);
    arrayOfObject[3] = Integer.valueOf(this.w);
    return String.format("crop area[x=%d,y=%d,h=%d,w=%d]", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.w
 * JD-Core Version:    0.6.2
 */