package com.tencent.kingkong;

public class CrossProcessCursorWrapper extends CursorWrapper
  implements CrossProcessCursor
{
  public CrossProcessCursorWrapper(Cursor paramCursor)
  {
    super(paramCursor);
  }

  public void fillWindow(int paramInt, CursorWindow paramCursorWindow)
  {
    if ((this.mCursor instanceof CrossProcessCursor))
    {
      ((CrossProcessCursor)this.mCursor).fillWindow(paramInt, paramCursorWindow);
      return;
    }
    DatabaseUtils.cursorFillWindow(this.mCursor, paramInt, paramCursorWindow);
  }

  public CursorWindow getWindow()
  {
    if ((this.mCursor instanceof CrossProcessCursor))
      return ((CrossProcessCursor)this.mCursor).getWindow();
    return null;
  }

  public boolean onMove(int paramInt1, int paramInt2)
  {
    if ((this.mCursor instanceof CrossProcessCursor))
      return ((CrossProcessCursor)this.mCursor).onMove(paramInt1, paramInt2);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.CrossProcessCursorWrapper
 * JD-Core Version:    0.6.2
 */