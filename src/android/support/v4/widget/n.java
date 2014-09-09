package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class n extends a
{
  private int gH;
  private int gI;
  private LayoutInflater gJ;

  public final View newDropDownView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.gJ.inflate(this.gI, paramViewGroup, false);
  }

  public View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return this.gJ.inflate(this.gH, paramViewGroup, false);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.n
 * JD-Core Version:    0.6.2
 */