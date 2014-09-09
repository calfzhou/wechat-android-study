package com.tencent.mm.plugin.safedevice.ui;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Toast;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelsimple.ab;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.safedevice.a.d;
import com.tencent.mm.plugin.safedevice.a.f;
import com.tencent.mm.q;
import com.tencent.mm.sdk.f.al;
import com.tencent.mm.sdk.f.ao;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MySafeDeviceListUI extends MMPreference
  implements com.tencent.mm.o.m, al
{
  private ProgressDialog dWT = null;
  private com.tencent.mm.ui.base.preference.o dXi;
  private int fTY = -2;
  private List fTZ;
  private s fUa;
  private boolean fUb = true;
  private List fUc;
  private MenuItem.OnMenuItemClickListener fUd = new h(this);
  private cm gQj = new k(this);

  private void bR(boolean paramBoolean)
  {
    this.fTZ.clear();
    this.fUc = f.afl().afh();
    this.dXi.removeAll();
    this.dXi.addPreferencesFromResource(q.czO);
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.dXi.BU("safe_device_verify_check");
    if (localCheckBoxPreference != null)
      localCheckBoxPreference.setChecked(paramBoolean);
    if (this.fUc.size() == 0)
    {
      this.dXi.BV("my_safe_device_list_tip");
      eC(false);
      return;
    }
    if (this.fTY == 1)
    {
      a(0, getString(com.tencent.mm.n.cbK), this.fUd);
      this.fTY = (0xFFFFFFFF ^ this.fTY);
    }
    Iterator localIterator = this.fUc.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.safedevice.a.c localc = (com.tencent.mm.plugin.safedevice.a.c)localIterator.next();
      SafeDeviceListPreference localSafeDeviceListPreference = new SafeDeviceListPreference(this);
      localSafeDeviceListPreference.setKey("mysafedevice_" + localc.field_uid);
      localSafeDeviceListPreference.setTitle(com.tencent.mm.ar.b.e(this, localc.field_name, -1));
      if (!com.tencent.mm.sdk.platformtools.l.iDv)
        localSafeDeviceListPreference.setSummary(localc.field_devicetype);
      localSafeDeviceListPreference.a(this.fUa);
      localSafeDeviceListPreference.a(this.fUa);
      localSafeDeviceListPreference.b(localc);
      this.dXi.a(localSafeDeviceListPreference, -1);
      this.fTZ.add(localSafeDeviceListPreference);
    }
    eC(true);
  }

  protected final void DP()
  {
    a(new r(this));
    this.dXi = aTL();
    this.fTZ = new LinkedList();
    this.fUa = new s(this, (byte)0);
    a(0, getString(com.tencent.mm.n.cbK), this.fUd);
    oP(com.tencent.mm.n.cbx);
  }

  public final int DZ()
  {
    return -1;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.o.x paramx)
  {
    if ((this.dWT != null) && (this.dWT.isShowing()))
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if (paramx.getType() == 302)
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.fUb = com.tencent.mm.model.x.pM();
        bR(this.fUb);
      }
    do
    {
      do
      {
        do
          return;
        while (com.tencent.mm.plugin.a.a.dWp.a(this, paramInt1, paramInt2, paramString));
        int i = com.tencent.mm.n.cbN;
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(paramInt1);
        arrayOfObject[1] = Integer.valueOf(paramInt2);
        Toast.makeText(this, getString(i, arrayOfObject), 0).show();
        return;
      }
      while (paramx.getType() != 361);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.plugin.safedevice.a.b localb = (com.tencent.mm.plugin.safedevice.a.b)paramx;
        com.tencent.mm.plugin.safedevice.a.c localc = new com.tencent.mm.plugin.safedevice.a.c();
        localc.field_devicetype = localb.getDeviceType();
        localc.field_name = localb.getDeviceName();
        localc.field_uid = localb.getDeviceId();
        localc.field_createtime = 0L;
        f.afl().a(localc, new String[0]);
        com.tencent.mm.ui.base.e.aw(this, com.tencent.mm.aq.a.p(this, com.tencent.mm.n.cbQ));
        return;
      }
    }
    while (!com.tencent.mm.plugin.a.a.dWp.a(this, paramInt1, paramInt2, paramString));
  }

  public final void a(String paramString, ao paramao)
  {
    z.i("!44@/B4Tb64lLpK17Cy+IK1HH08djXQCkIZFwr3WucVnP+g=", "notify " + paramString);
    this.gQj.post(new i(this));
  }

  public final boolean a(com.tencent.mm.ui.base.preference.o paramo, Preference paramPreference)
  {
    String str = paramPreference.getKey();
    if (ch.jb(str))
    {
      z.e("!44@/B4Tb64lLpK17Cy+IK1HH08djXQCkIZFwr3WucVnP+g=", "null key");
      return false;
    }
    boolean bool;
    if (str.equals("safe_device_verify_check"))
    {
      bool = ((CheckBoxPreference)paramPreference).isChecked();
      if (!bool)
        com.tencent.mm.ui.base.e.b(this, com.tencent.mm.n.cbG, com.tencent.mm.n.cbF, new l(this, bool), new m(this));
    }
    while (true)
    {
      return true;
      if (!this.fUb)
        if (((Integer)bg.qW().oQ().get(64, Integer.valueOf(-1))).intValue() != 1)
        {
          com.tencent.mm.ui.base.e.b(this, com.tencent.mm.n.cbX, com.tencent.mm.n.cbY, new n(this), new o(this));
        }
        else
        {
          this.fUb = bool;
          bR(this.fUb);
          com.tencent.mm.plugin.safedevice.a.e.j(true, true);
          continue;
          if (str.startsWith("mysafedevice_"))
          {
            SafeDeviceListPreference localSafeDeviceListPreference = (SafeDeviceListPreference)paramPreference;
            if (localSafeDeviceListPreference != null)
            {
              com.tencent.mm.plugin.safedevice.a.c localc = localSafeDeviceListPreference.afo();
              com.tencent.mm.ui.base.e.a(aPI(), getString(com.tencent.mm.n.cbM), localc.field_name, getString(com.tencent.mm.n.cbP), new p(this, localc));
            }
          }
        }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    bg.qX().a(302, this);
    bg.qX().a(361, this);
    f.afl().g(this);
    DP();
    ab localab = new ab(com.tencent.mm.model.x.pG());
    bg.qX().d(localab);
    getString(com.tencent.mm.n.buo);
    this.dWT = com.tencent.mm.ui.base.e.a(this, getString(com.tencent.mm.n.buA), true, new j(this, localab));
  }

  protected void onDestroy()
  {
    super.onDestroy();
    bg.qX().b(302, this);
    bg.qX().b(361, this);
    f.afl().h(this);
  }

  protected void onResume()
  {
    super.onResume();
    this.fUb = com.tencent.mm.model.x.pM();
    bR(this.fUb);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.MySafeDeviceListUI
 * JD-Core Version:    0.6.2
 */