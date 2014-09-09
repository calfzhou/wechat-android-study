package com.tencent.mm.ui.base.preference;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.MenuItem;
import android.widget.ListView;
import com.tencent.mm.k;
import com.tencent.mm.ui.ai;
import com.tencent.mm.ui.dz;

public abstract class z extends dz
{
  private SharedPreferences dkI;
  private ListView ewk;
  private boolean gRh = false;
  private y jhg;
  private boolean ya = false;

  public static boolean aTP()
  {
    return false;
  }

  public abstract int DZ();

  public final void aAB()
  {
    this.ewk.setAdapter(null);
  }

  public final o aTL()
  {
    return this.jhg;
  }

  public final void aTQ()
  {
    this.ewk.setAdapter(this.jhg);
  }

  public abstract boolean e(Preference paramPreference);

  protected final int getLayoutId()
  {
    return k.bjm;
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.dkI = Bp(h().getPackageName() + "_preferences");
    this.jhg = new y(agh(), this.dkI);
    this.ewk = ((ListView)findViewById(16908298));
    this.jhg.b(new aa(this));
    int i = DZ();
    if (i != -1)
      this.jhg.addPreferencesFromResource(i);
    this.ewk.setAdapter(this.jhg);
    this.ewk.setOnItemClickListener(new ab(this));
    this.ewk.setOnItemLongClickListener(new ae(this));
  }

  public final boolean onContextItemSelected(MenuItem paramMenuItem)
  {
    return super.onContextItemSelected(paramMenuItem);
  }

  public void onResume()
  {
    super.onResume();
    this.jhg.notifyDataSetChanged();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.z
 * JD-Core Version:    0.6.2
 */