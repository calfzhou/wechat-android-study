package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.mm.f;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class y extends BaseAdapter
  implements o
{
  private final Context context;
  private final SharedPreferences dkI;
  private ai jgy;
  private final af jhm;
  private final LinkedList jhn = new LinkedList();
  private final HashMap jho = new HashMap();
  private final HashSet jhp = new HashSet();
  private final LinkedList jhq = new LinkedList();
  private final HashMap jhr = new HashMap();
  private final HashMap jhs = new HashMap();
  private int[] jht = new int[0];
  private boolean jhu = false;
  private boolean jhv = false;

  public y(Context paramContext, SharedPreferences paramSharedPreferences)
  {
    this.jhm = new af(paramContext);
    this.context = paramContext;
    this.dkI = paramSharedPreferences;
  }

  private static void a(Preference paramPreference, SharedPreferences paramSharedPreferences)
  {
    if ((paramPreference instanceof CheckBoxPreference))
    {
      CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)paramPreference;
      if (localCheckBoxPreference.isPersistent())
        localCheckBoxPreference.setChecked(paramSharedPreferences.getBoolean(paramPreference.getKey(), ((CheckBoxPreference)paramPreference).isChecked()));
    }
    if ((paramPreference instanceof DialogPreference))
    {
      DialogPreference localDialogPreference = (DialogPreference)paramPreference;
      if (localDialogPreference.isPersistent())
        localDialogPreference.setValue(paramSharedPreferences.getString(paramPreference.getKey(), null));
    }
    if ((paramPreference instanceof EditPreference))
    {
      EditPreference localEditPreference = (EditPreference)paramPreference;
      if (localEditPreference.isPersistent())
      {
        localEditPreference.setValue(paramSharedPreferences.getString(paramPreference.getKey(), null));
        localEditPreference.setSummary(localEditPreference.getValue());
      }
    }
  }

  private void aTO()
  {
    HashSet localHashSet = new HashSet();
    int i = 0;
    if (i < this.jhq.size())
    {
      Preference localPreference1 = (Preference)this.jho.get(this.jhq.get(i));
      if (((localPreference1 instanceof PreferenceCategory)) && (ch.jb(localPreference1.getKey())) && (i != 0))
      {
        Preference localPreference2 = (Preference)this.jho.get(this.jhq.get(i - 1));
        if ((localPreference2 instanceof PreferenceCategory))
        {
          if ((!ch.jb(localPreference2.getKey())) || ((localPreference2.getTitle() != null) && (localPreference2.getTitle().toString().trim().length() > 0)))
            break label150;
          localHashSet.add(d(localPreference2));
        }
      }
      while (true)
      {
        i++;
        break;
        label150: if ((ch.jb(localPreference1.getKey())) && ((localPreference1.getTitle() == null) || (localPreference1.getTitle().toString().trim().length() <= 0)))
          localHashSet.add(d(localPreference1));
      }
    }
    this.jhq.removeAll(localHashSet);
  }

  private void b(Preference paramPreference, int paramInt)
  {
    String str = d(paramPreference);
    this.jho.put(str, paramPreference);
    LinkedList localLinkedList = this.jhn;
    if (paramInt == -1)
      paramInt = this.jhn.size();
    localLinkedList.add(paramInt, str);
    if ((!this.jhr.containsKey(c(paramPreference))) && (!this.jhv))
      this.jhr.put(c(paramPreference), Integer.valueOf(this.jhr.size()));
    if (paramPreference.getDependency() != null)
      this.jhs.put(paramPreference.getDependency() + "|" + paramPreference.getKey(), paramPreference.getKey());
  }

  private static String c(Preference paramPreference)
  {
    return paramPreference.getClass().getName() + "L" + paramPreference.getLayoutResource() + "W" + paramPreference.getWidgetLayoutResource();
  }

  private static String d(Preference paramPreference)
  {
    if ((paramPreference.getKey() != null) && (paramPreference.getKey().length() > 0))
      return paramPreference.getKey();
    return "_anonymous_pref@" + paramPreference.hashCode();
  }

  private static boolean pX(int paramInt)
  {
    return (paramInt == k.biA) || (paramInt == k.bjC);
  }

  public final Preference BU(String paramString)
  {
    return (Preference)this.jho.get(paramString);
  }

  public final boolean BV(String paramString)
  {
    return b(BU(paramString));
  }

  public final int BW(String paramString)
  {
    if (this.jhq == null)
      return -1;
    return this.jhq.indexOf(paramString);
  }

  public final void R(String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
      if (!this.jhp.contains(paramString))
        this.jhp.add(paramString);
    while (this.jhp.remove(paramString))
    {
      notifyDataSetChanged();
      return;
    }
  }

  public final void a(Preference paramPreference)
  {
    a(paramPreference, -1);
  }

  public final void a(Preference paramPreference, int paramInt)
  {
    b(paramPreference, paramInt);
    if (!this.jhu)
      notifyDataSetChanged();
  }

  public final void addPreferencesFromResource(int paramInt)
  {
    this.jhu = true;
    this.jhm.a(paramInt, this);
    this.jhu = false;
    notifyDataSetChanged();
  }

  public final void b(ai paramai)
  {
    this.jgy = paramai;
    notifyDataSetChanged();
  }

  public final boolean b(Preference paramPreference)
  {
    if (paramPreference == null)
      return false;
    String str = d(paramPreference);
    this.jhn.remove(str);
    this.jho.remove(str);
    this.jhp.remove(paramPreference.getKey());
    notifyDataSetChanged();
    return true;
  }

  public int getCount()
  {
    return this.jhq.size();
  }

  public Object getItem(int paramInt)
  {
    return this.jho.get(this.jhq.get(paramInt));
  }

  public long getItemId(int paramInt)
  {
    return 0L;
  }

  public int getItemViewType(int paramInt)
  {
    Preference localPreference = (Preference)this.jho.get(this.jhq.get(paramInt));
    Integer localInteger = (Integer)this.jhr.get(c(localPreference));
    if (localInteger == null)
      return -1;
    return localInteger.intValue();
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    Preference localPreference = (Preference)this.jho.get(this.jhq.get(paramInt));
    if ((localPreference instanceof CheckBoxPreference))
      localPreference.a(this.jgy);
    if (!this.jhr.containsKey(c(localPreference)))
      paramView = null;
    View localView1 = localPreference.getView(paramView, paramViewGroup);
    int i = this.jht[paramInt];
    View localView2 = localView1.findViewById(i.content);
    if (localView2 == null)
    {
      z.e("!44@/B4Tb64lLpL7nV+aKji0O5oZqg+g/M2CVC2enFN9hcI=", "find content view error");
      return localView1;
    }
    View localView3 = localView1.findViewById(16908312);
    int j;
    int k;
    int m;
    int n;
    int i1;
    int i2;
    int i3;
    int i4;
    int i5;
    int i7;
    int i6;
    if ((i & 0x4) == 0)
    {
      j = localView2.getPaddingLeft();
      k = localView2.getPaddingRight();
      m = localView2.getPaddingTop();
      n = localView2.getPaddingBottom();
      i1 = h.aTi;
      i2 = localView1.getPaddingLeft();
      i3 = localView1.getPaddingRight();
      i4 = localView1.getPaddingTop();
      i5 = localView1.getPaddingBottom();
      if ((i & 0x8) == 0)
        break label326;
      if ((paramInt != -1 + this.jhq.size()) && ((paramInt != -2 + this.jhq.size()) || (!(getItem(-1 + this.jhq.size()) instanceof PreferenceCategory))))
        break label303;
      i7 = h.WT;
      int i8 = f.white;
      i6 = i7;
      i1 = i8;
    }
    while (true)
    {
      localView2.setBackgroundResource(i6);
      localView2.setPadding(j, m, k, n);
      if (localView3 != null)
        localView3.setBackgroundResource(i6);
      localView1.setBackgroundResource(i1);
      localView1.setPadding(i2, i4, i3, i5);
      return localView1;
      label303: if ((i & 0x2) != 0)
      {
        i7 = h.WT;
        break;
      }
      i7 = h.Wf;
      break;
      label326: if (((i & 0x10) == 0) && ((i & 0x2) != 0))
        i6 = h.Uk;
      else
        i6 = h.Wf;
    }
  }

  public int getViewTypeCount()
  {
    if (!this.jhv)
      this.jhv = true;
    return Math.max(1, this.jhr.size());
  }

  public final int indexOf(String paramString)
  {
    return this.jhn.indexOf(paramString);
  }

  public void notifyDataSetChanged()
  {
    this.jhq.clear();
    Iterator localIterator = this.jhn.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!this.jhp.contains(str))
        if (this.jho.get(str) == null)
          z.e("!44@/B4Tb64lLpL7nV+aKji0O5oZqg+g/M2CVC2enFN9hcI=", "not found pref by key " + str);
        else
          this.jhq.add(str);
    }
    if ((!this.jhq.isEmpty()) && (pX(((Preference)this.jho.get(this.jhq.get(0))).getLayoutResource())))
      b(new PreferenceSmallCategory(this.context), 0);
    aTO();
    this.jht = new int[this.jhq.size()];
    if (this.jht.length <= 0)
      return;
    int i = this.jht.length;
    int j = 0;
    if (i == 1)
    {
      int i4 = ((Preference)this.jho.get(this.jhq.get(0))).getLayoutResource();
      Preference localPreference2 = (Preference)this.jho.get(this.jhq.get(0));
      if (pX(i4))
        if ((localPreference2 instanceof CheckBoxPreference))
        {
          int[] arrayOfInt10 = this.jht;
          arrayOfInt10[0] = (0x8 | arrayOfInt10[0]);
        }
      while (true)
      {
        a((Preference)this.jho.get(this.jhq.get(0)), this.dkI);
        super.notifyDataSetChanged();
        return;
        this.jht[0] = 3;
        continue;
        this.jht[0] = 4;
      }
    }
    if (j < this.jhq.size())
    {
      a((Preference)this.jho.get(this.jhq.get(j)), this.dkI);
      Preference localPreference1 = (Preference)this.jho.get(this.jhq.get(j));
      int k = localPreference1.getLayoutResource();
      if (pX(k))
        if ((localPreference1 instanceof CheckBoxPreference))
        {
          int[] arrayOfInt9 = this.jht;
          arrayOfInt9[j] = (0x8 | arrayOfInt9[j]);
        }
      while (true)
      {
        j++;
        break;
        if (j == 0)
        {
          int[] arrayOfInt8 = this.jht;
          arrayOfInt8[j] = (0x1 | arrayOfInt8[j]);
        }
        else
        {
          if (j == -1 + this.jhq.size())
          {
            int[] arrayOfInt7 = this.jht;
            arrayOfInt7[j] = (0x2 | arrayOfInt7[j]);
          }
          int i3 = ((Preference)this.jho.get(this.jhq.get(j - 1))).getLayoutResource();
          if ((i3 != k.biA) || (i3 == k.bjC))
          {
            int[] arrayOfInt6 = this.jht;
            arrayOfInt6[j] = (0x1 | arrayOfInt6[j]);
            continue;
            if (k == k.bjr)
            {
              if (j == 0)
              {
                int[] arrayOfInt5 = this.jht;
                arrayOfInt5[j] = (0x4 | arrayOfInt5[j]);
              }
              else
              {
                int[] arrayOfInt3 = this.jht;
                arrayOfInt3[j] = (0x10 | arrayOfInt3[j]);
                int i1 = ((Preference)this.jho.get(this.jhq.get(j - 1))).getLayoutResource();
                if ((i1 == k.biA) || (i1 == k.bjC))
                {
                  int[] arrayOfInt4 = this.jht;
                  int i2 = j - 1;
                  arrayOfInt4[i2] = (0x2 | arrayOfInt4[i2]);
                }
              }
            }
            else
            {
              int[] arrayOfInt1 = this.jht;
              arrayOfInt1[j] = (0x4 | arrayOfInt1[j]);
              if (j != 0)
              {
                int m = ((Preference)this.jho.get(this.jhq.get(j - 1))).getLayoutResource();
                if ((pX(m)) || (m == k.bjr))
                {
                  int[] arrayOfInt2 = this.jht;
                  int n = j - 1;
                  arrayOfInt2[n] = (0x2 | arrayOfInt2[n]);
                }
              }
            }
          }
        }
      }
    }
    super.notifyDataSetChanged();
  }

  public final void removeAll()
  {
    this.jhq.clear();
    this.jho.clear();
    this.jhn.clear();
    this.jhp.clear();
    notifyDataSetChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.y
 * JD-Core Version:    0.6.2
 */