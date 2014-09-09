package android.support.v4.widget;

import android.database.Cursor;

abstract interface d
{
  public abstract void changeCursor(Cursor paramCursor);

  public abstract CharSequence convertToString(Cursor paramCursor);

  public abstract Cursor getCursor();

  public abstract Cursor runQueryOnBackgroundThread(CharSequence paramCharSequence);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.d
 * JD-Core Version:    0.6.2
 */