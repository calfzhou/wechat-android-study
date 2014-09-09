package com.tencent.mm.ap.a;

import java.lang.reflect.Array;

public final class f
{
  private final int height;
  private final byte[][] iyX;
  private final int width;

  public f(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = { paramInt2, paramInt1 };
    this.iyX = ((byte[][])Array.newInstance(Byte.TYPE, arrayOfInt));
    this.width = paramInt1;
    this.height = paramInt2;
  }

  public final byte[][] aLT()
  {
    return this.iyX;
  }

  public final void aLU()
  {
    for (int i = 0; i < this.height; i++)
      for (int j = 0; j < this.width; j++)
        this.iyX[i][j] = -1;
  }

  public final byte aP(int paramInt1, int paramInt2)
  {
    return this.iyX[paramInt2][paramInt1];
  }

  public final int getHeight()
  {
    return this.height;
  }

  public final int getWidth()
  {
    return this.width;
  }

  public final void set(int paramInt1, int paramInt2, int paramInt3)
  {
    this.iyX[paramInt2][paramInt1] = ((byte)paramInt3);
  }

  public final void set(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    byte[] arrayOfByte = this.iyX[paramInt2];
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      arrayOfByte[paramInt1] = ((byte)i);
      return;
    }
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(2 + 2 * this.width * this.height);
    for (int i = 0; i < this.height; i++)
    {
      int j = 0;
      if (j < this.width)
      {
        switch (this.iyX[i][j])
        {
        default:
          localStringBuilder.append("  ");
        case 0:
        case 1:
        }
        while (true)
        {
          j++;
          break;
          localStringBuilder.append(" 0");
          continue;
          localStringBuilder.append(" 1");
        }
      }
      localStringBuilder.append('\n');
    }
    return localStringBuilder.toString();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ap.a.f
 * JD-Core Version:    0.6.2
 */