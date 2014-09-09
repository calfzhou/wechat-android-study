package com.tencent.mm.ui.base.preference;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AbsListView.LayoutParams;
import android.widget.ListView;
import com.tencent.mm.k;
import com.tencent.mm.sdk.platformtools.h;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;

public abstract class MMPreference extends MMActivity
{
  private SharedPreferences dkI;
  private ListView ewk;
  private boolean gRh = false;
  private y jhg;
  private boolean ya = false;

  protected boolean DY()
  {
    return true;
  }

  public abstract int DZ();

  public int Ji()
  {
    return -1;
  }

  public y a(SharedPreferences paramSharedPreferences)
  {
    return new y(this, paramSharedPreferences);
  }

  public abstract boolean a(o paramo, Preference paramPreference);

  public final o aTL()
  {
    return this.jhg;
  }

  public final SharedPreferences aTM()
  {
    return this.dkI;
  }

  public final boolean aTN()
  {
    h.a(this.ewk);
    return true;
  }

  public View axM()
  {
    return null;
  }

  protected int getLayoutId()
  {
    return k.bju;
  }

  public final ListView getListView()
  {
    return this.ewk;
  }

  public boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    return super.onContextItemSelected(paramMenuItem);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.dkI = getSharedPreferences(getPackageName() + "_preferences", 0);
    this.jhg = a(this.dkI);
    this.ewk = ((ListView)findViewById(16908298));
    int i = Ji();
    View localView1 = axM();
    if (i != -1)
    {
      localView2 = getLayoutInflater().inflate(i, null);
      this.ewk.addHeaderView(localView2);
    }
    while (localView1 == null)
    {
      View localView2;
      this.jhg.b(new t(this));
      int j = DZ();
      if (j != -1)
        this.jhg.addPreferencesFromResource(j);
      this.ewk.setAdapter(this.jhg);
      this.ewk.setOnItemClickListener(new u(this));
      this.ewk.setOnItemLongClickListener(new x(this));
      return;
    }
    if (localView1.getLayoutParams() != null)
      localView1.setLayoutParams(new AbsListView.LayoutParams(localView1.getLayoutParams()));
    while (true)
    {
      this.ewk.addHeaderView(localView1);
      break;
      z.e("!44@/B4Tb64lLpI7WPWuV/POwea5Zt4GP9FSxYknwdWPxmk=", "[arthurdan.mmpreference] Notice!!! header.getLayoutParams() is null!!!\n");
    }
  }

  protected void onResume()
  {
    if (DY())
      this.jhg.notifyDataSetChanged();
    super.onResume();
  }

  public final void setSelection(int paramInt)
  {
    this.ewk.setSelection(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.MMPreference
 * JD-Core Version:    0.6.2
 */