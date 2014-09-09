package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import com.tencent.mm.k;
import com.tencent.mm.p;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.ad;
import com.tencent.mm.ui.base.e;
import java.util.HashMap;

public final class DialogPreference extends Preference
{
  private aa fav;
  private final g jgA;
  private j jgB;
  private ai jgy;

  public DialogPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public DialogPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public DialogPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.jgA = new g(paramContext);
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, p.cvZ, paramInt, 0);
    this.jgA.jgw = localTypedArray.getTextArray(p.cwa);
    this.jgA.jgx = localTypedArray.getTextArray(p.cwb);
    localTypedArray.recycle();
    this.jgA.aTD();
  }

  public final void a(ai paramai)
  {
    this.jgy = paramai;
  }

  public final void a(j paramj)
  {
    this.jgB = paramj;
  }

  public final String getValue()
  {
    return this.jgA.value;
  }

  public final void onBindView(View paramView)
  {
    f localf = (f)this.jgA.dhJ.get(this.jgA.value);
    if (localf != null)
      setSummary(localf.text);
    super.onBindView(paramView);
  }

  public final void setValue(String paramString)
  {
    this.jgA.value = paramString;
    f localf = (f)this.jgA.dhJ.get(paramString);
    if (localf == null)
    {
      this.jgA.fyO = -1;
      return;
    }
    this.jgA.fyO = localf.id;
  }

  protected final void showDialog()
  {
    ListView localListView = (ListView)View.inflate(getContext(), k.biw, null);
    localListView.setOnItemClickListener(new i(this));
    localListView.setAdapter(this.jgA);
    ad localad = new ad(getContext());
    localad.BK(getTitle().toString());
    localad.ao(localListView);
    this.fav = localad.aRB();
    this.fav.show();
    e.a(getContext(), this.fav);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.DialogPreference
 * JD-Core Version:    0.6.2
 */