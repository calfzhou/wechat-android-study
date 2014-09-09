package com.tencent.mm.ui.account;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import java.util.ArrayList;
import java.util.List;

final class d extends Filter
{
  private d(c paramc)
  {
  }

  protected final Filter.FilterResults performFiltering(CharSequence paramCharSequence)
  {
    int i = 0;
    Filter.FilterResults localFilterResults = new Filter.FilterResults();
    if (c.a(this.iNM) == null);
    synchronized (c.b(this.iNM))
    {
      c.a(this.iNM, new ArrayList(c.c(this.iNM)));
      if (paramCharSequence != null)
        if (paramCharSequence.length() != 0)
          break label134;
    }
    synchronized (c.b(this.iNM))
    {
      ArrayList localArrayList1 = new ArrayList(c.a(this.iNM));
      localFilterResults.values = localArrayList1;
      localFilterResults.count = localArrayList1.size();
      return localFilterResults;
      localObject4 = finally;
      throw localObject4;
    }
    label134: String str1 = paramCharSequence.toString().toLowerCase();
    String str5;
    String str2;
    if ((c.d(this.iNM) != null) && (c.d(this.iNM).length() > 0))
    {
      String[] arrayOfString = str1.split(c.d(this.iNM));
      if ((arrayOfString != null) && (arrayOfString.length > 1))
      {
        str5 = arrayOfString[0] + c.d(this.iNM);
        str2 = arrayOfString[1];
      }
    }
    for (String str3 = str5; ; str3 = "")
    {
      ArrayList localArrayList2 = c.a(this.iNM);
      int j = localArrayList2.size();
      ArrayList localArrayList3 = new ArrayList(j);
      while (i < j)
      {
        String str4 = (String)localArrayList2.get(i);
        if (str4.toString().toLowerCase().startsWith(str2))
          localArrayList3.add(str3 + str4);
        i++;
      }
      localFilterResults.values = localArrayList3;
      localFilterResults.count = localArrayList3.size();
      return localFilterResults;
      str2 = str1;
    }
  }

  protected final void publishResults(CharSequence paramCharSequence, Filter.FilterResults paramFilterResults)
  {
    c.a(this.iNM, (List)paramFilterResults.values);
    if (paramFilterResults.count > 0)
    {
      this.iNM.notifyDataSetChanged();
      return;
    }
    this.iNM.notifyDataSetInvalidated();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.d
 * JD-Core Version:    0.6.2
 */