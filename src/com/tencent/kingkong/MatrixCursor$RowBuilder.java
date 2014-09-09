package com.tencent.kingkong;

public class MatrixCursor$RowBuilder
{
  private final int endIndex;
  private int index;

  MatrixCursor$RowBuilder(MatrixCursor paramMatrixCursor, int paramInt1, int paramInt2)
  {
    this.index = paramInt1;
    this.endIndex = paramInt2;
  }

  public RowBuilder add(Object paramObject)
  {
    if (this.index == this.endIndex)
      throw new CursorIndexOutOfBoundsException("No more columns left.");
    Object[] arrayOfObject = MatrixCursor.access$0(this.this$0);
    int i = this.index;
    this.index = (i + 1);
    arrayOfObject[i] = paramObject;
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.MatrixCursor.RowBuilder
 * JD-Core Version:    0.6.2
 */