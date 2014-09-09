package com.tencent.kingkong;

public abstract interface CrossProcessCursor extends Cursor
{
  public abstract void fillWindow(int paramInt, CursorWindow paramCursorWindow);

  public abstract CursorWindow getWindow();

  public abstract boolean onMove(int paramInt1, int paramInt2);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.CrossProcessCursor
 * JD-Core Version:    0.6.2
 */