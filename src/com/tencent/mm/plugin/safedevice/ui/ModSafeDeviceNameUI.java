package com.tencent.mm.plugin.safedevice.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.e;

public class ModSafeDeviceNameUI extends MMActivity
  implements m
{
  private long dGa;
  private ProgressDialog dWT = null;
  private String fTM;
  private EditText fTR;
  private String fTS;
  private String fTT;
  private String fTU;

  protected final void DP()
  {
    this.fTS = getIntent().getStringExtra("safe_device_name");
    this.fTU = getIntent().getStringExtra("safe_device_uid");
    this.fTM = getIntent().getStringExtra("safe_device_type");
    Bt(com.tencent.mm.aq.a.p(this, n.cbM));
    a(new c(this));
    a(0, getString(n.bud), new d(this));
    f localf = new f(this);
    this.fTR = ((EditText)findViewById(i.aER));
    com.tencent.mm.ui.widget.d locald = new com.tencent.mm.ui.widget.d(this.fTR, null, 32);
    locald.b(localf);
    this.fTR.addTextChangedListener(locald);
    if (!ch.jb(this.fTS))
    {
      this.fTR.setText(this.fTS);
      return;
    }
    eB(false);
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    if ((this.dWT != null) && (this.dWT.isShowing()))
    {
      this.dWT.dismiss();
      this.dWT = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      localc = new com.tencent.mm.plugin.safedevice.a.c();
      localc.field_devicetype = this.fTM;
      localc.field_name = this.fTT;
      localc.field_uid = this.fTU;
      localc.field_createtime = this.dGa;
      com.tencent.mm.plugin.safedevice.a.f.afl().a(localc, new String[0]);
      e.aw(this, com.tencent.mm.aq.a.p(this, n.cbQ));
      new cm().postDelayed(new g(this), 1000L);
    }
    while (!com.tencent.mm.plugin.a.a.dWp.a(this, paramInt1, paramInt2, paramString))
    {
      com.tencent.mm.plugin.safedevice.a.c localc;
      return;
    }
  }

  protected final int getLayoutId()
  {
    return k.aER;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }

  protected void onPause()
  {
    bg.qX().b(361, this);
    super.onPause();
  }

  protected void onResume()
  {
    bg.qX().a(361, this);
    super.onResume();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.ui.ModSafeDeviceNameUI
 * JD-Core Version:    0.6.2
 */