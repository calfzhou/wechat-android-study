package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

public abstract class a extends BaseAdapter
  implements d, Filterable
{
  protected boolean fU;
  protected boolean fV;
  protected Cursor fW;
  protected int fX;
  protected b fY;
  protected DataSetObserver fZ;
  protected c ga;
  protected FilterQueryProvider gb;
  protected Context mContext;

  public abstract void a(View paramView, Cursor paramCursor);

  public void changeCursor(Cursor paramCursor)
  {
    Cursor localCursor;
    if (paramCursor == this.fW)
      localCursor = null;
    while (true)
    {
      if (localCursor != null)
        localCursor.close();
      return;
      localCursor = this.fW;
      if (localCursor != null)
      {
        if (this.fY != null)
          localCursor.unregisterContentObserver(this.fY);
        if (this.fZ != null)
          localCursor.unregisterDataSetObserver(this.fZ);
      }
      this.fW = paramCursor;
      if (paramCursor != null)
      {
        if (this.fY != null)
          paramCursor.registerContentObserver(this.fY);
        if (this.fZ != null)
          paramCursor.registerDataSetObserver(this.fZ);
        this.fX = paramCursor.getColumnIndexOrThrow("_id");
        this.fU = true;
        notifyDataSetChanged();
      }
      else
      {
        this.fX = -1;
        this.fU = false;
        notifyDataSetInvalidated();
      }
    }
  }

  public CharSequence convertToString(Cursor paramCursor)
  {
    if (paramCursor == null)
      return "";
    return paramCursor.toString();
  }

  public int getCount()
  {
    if ((this.fU) && (this.fW != null))
      return this.fW.getCount();
    return 0;
  }

  public final Cursor getCursor()
  {
    return this.fW;
  }

  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.fU)
    {
      this.fW.moveToPosition(paramInt);
      if (paramView == null)
        paramView = newDropDownView(this.mContext, this.fW, paramViewGroup);
      a(paramView, this.fW);
      return paramView;
    }
    return null;
  }

  public Filter getFilter()
  {
    if (this.ga == null)
      this.ga = new c(this);
    return this.ga;
  }

  public Object getItem(int paramInt)
  {
    if ((this.fU) && (this.fW != null))
    {
      this.fW.moveToPosition(paramInt);
      return this.fW;
    }
    return null;
  }

  public long getItemId(int paramInt)
  {
    long l = 0L;
    if ((this.fU) && (this.fW != null) && (this.fW.moveToPosition(paramInt)))
      l = this.fW.getLong(this.fX);
    return l;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (!this.fU)
      throw new IllegalStateException("this should only be called when the cursor is valid");
    if (!this.fW.moveToPosition(paramInt))
      throw new IllegalStateException("couldn't move cursor to position " + paramInt);
    if (paramView == null)
      paramView = newView(this.mContext, this.fW, paramViewGroup);
    a(paramView, this.fW);
    return paramView;
  }

  public boolean hasStableIds()
  {
    return true;
  }

  public View newDropDownView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    return newView(paramContext, paramCursor, paramViewGroup);
  }

  public abstract View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup);

  protected final void onContentChanged()
  {
    if ((this.fV) && (this.fW != null) && (!this.fW.isClosed()))
      this.fU = this.fW.requery();
  }

  public Cursor runQueryOnBackgroundThread(CharSequence paramCharSequence)
  {
    if (this.gb != null)
      return this.gb.runQuery(paramCharSequence);
    return this.fW;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.a
 * JD-Core Version:    0.6.2
 */