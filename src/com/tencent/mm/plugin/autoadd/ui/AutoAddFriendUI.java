package com.tencent.mm.plugin.autoadd.ui;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.model.x;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.protocal.a.je;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMSwitchBtn;

public class AutoAddFriendUI extends MMActivity
{
  private MMSwitchBtn dYX = null;
  private TextView dYY = null;
  private MMSwitchBtn dYZ = null;
  private SparseIntArray dZa = new SparseIntArray();
  private int status;

  private static int Es()
  {
    String str = com.tencent.mm.f.c.om().getValue("AutoAddFriendShow");
    if (ch.jb(str))
      str = "0";
    try
    {
      int j = Integer.parseInt(str);
      i = j;
      Object[] arrayOfObject = new Object[1];
      arrayOfObject[0] = Integer.valueOf(i);
      z.d("!44@/B4Tb64lLpIUnX6zYA7Or5kIZW5+fEROecnNClGAtRM=", "getAutoAddDynamicConfig, autoAdd = %d", arrayOfObject);
      return i;
    }
    catch (Exception localException)
    {
      while (true)
        int i = 0;
    }
  }

  private boolean fb(int paramInt)
  {
    return (paramInt & this.status) != 0;
  }

  protected final void DP()
  {
    this.dYX = ((MMSwitchBtn)findViewById(i.aFV));
    this.dYY = ((TextView)findViewById(i.agY));
    this.dYZ = ((MMSwitchBtn)findViewById(i.agX));
    boolean bool = fb(32);
    this.dYX.gp(bool);
    if (Es() == 1)
    {
      this.dYZ.gp(fb(2097152));
      this.dYZ.a(new a(this));
    }
    while (true)
    {
      this.dYX.a(new b(this));
      a(new c(this));
      return;
      this.dYY.setVisibility(8);
      this.dYZ.setVisibility(8);
    }
  }

  protected final int getLayoutId()
  {
    return com.tencent.mm.k.bbf;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    oP(n.buI);
    this.status = x.pK();
    DP();
  }

  protected void onDestroy()
  {
    super.onDestroy();
  }

  protected void onPause()
  {
    super.onPause();
    com.tencent.mm.model.bg.qW().oQ().set(7, Integer.valueOf(this.status));
    for (int i = 0; i < this.dZa.size(); i++)
    {
      int j = this.dZa.keyAt(i);
      int k = this.dZa.valueAt(i);
      je localje = new je();
      localje.iad = j;
      localje.iae = k;
      com.tencent.mm.model.bg.qW().oS().a(new com.tencent.mm.storage.bg(23, localje));
      z.d("!44@/B4Tb64lLpIUnX6zYA7Or5kIZW5+fEROecnNClGAtRM=", "switch  " + j + " " + k);
    }
    com.tencent.mm.model.bg.qX().d(new com.tencent.mm.ab.k(5));
    this.dZa.clear();
  }

  protected void onResume()
  {
    super.onResume();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.autoadd.ui.AutoAddFriendUI
 * JD-Core Version:    0.6.2
 */