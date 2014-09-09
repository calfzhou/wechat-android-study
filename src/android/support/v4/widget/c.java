package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

final class c extends Filter
{
  d gd;

  c(d paramd)
  {
    this.gd = paramd;
  }

  public final CharSequence convertResultToString(Object paramObject)
  {
    return this.gd.convertToString((Cursor)paramObject);
  }

  protected final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    Cursor localCursor = this.gd.runQueryOnBackgroundThread(paramCharSequence);
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if (localCursor != null)
    {
      localFilterResults.count = localCursor.getCount();
      localFilterResults.values = localCursor;
      return localFilterResults;
    }
    localFilterResults.count = 0;
    localFilterResults.values = null;
    return localFilterResults;
  }

  protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    Cursor localCursor = this.gd.getCursor();
    if ((paramFilterResults.values != null) && (paramFilterResults.values != localCursor))
      this.gd.changeCursor((Cursor)paramFilterResults.values);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.widget.c
 * JD-Core Version:    0.6.2
 */