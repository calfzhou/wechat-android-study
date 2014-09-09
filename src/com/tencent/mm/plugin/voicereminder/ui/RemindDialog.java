package com.tencent.mm.plugin.voicereminder.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.dv;
import com.tencent.mm.n;
import com.tencent.mm.o.ac;
import com.tencent.mm.plugin.voicereminder.a.f;
import com.tencent.mm.plugin.voicereminder.a.k;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.ad;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemindDialog extends Activity
{
  private static List gSY = new ArrayList();
  private static boolean gSZ = false;
  private String cEh = "";
  private aa fav;
  private cm gQj = new cm();
  private List gSX = new ArrayList();
  private k gTa = new a(this);

  private void arI()
  {
    this.gQj.post(new e(this));
  }

  public static void h(Context paramContext, String paramString1, String paramString2)
  {
    z.d("!32@/B4Tb64lLpJfDXyKelEN4nDZk7Tu4Frw", "show " + gSZ + " remind " + paramString2);
    if (gSZ)
    {
      gSY.add(paramString2);
      return;
    }
    gSY.clear();
    gSZ = true;
    if (bg.qX().tv())
    {
      Intent localIntent1 = new Intent(paramContext, RemindDialog.class);
      localIntent1.putExtra("_RemindDialog_User", paramString1);
      localIntent1.putExtra("_RemindDialog_Remind", paramString2);
      localIntent1.setFlags(603979776);
      localIntent1.addFlags(268435456);
      paramContext.startActivity(localIntent1);
      return;
    }
    Intent localIntent2 = new Intent(paramContext, RemindDialog.class);
    localIntent2.putExtra("_RemindDialog_User", paramString1);
    localIntent2.putExtra("_RemindDialog_Remind", paramString2);
    localIntent2.setFlags(604012544);
    localIntent2.addFlags(268435456);
    paramContext.startActivity(localIntent2);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    ad localad = new ad(this);
    localad.pn(n.coj);
    localad.BL(" ");
    localad.d(n.cog, new b(this));
    localad.e(n.coi, new c(this));
    localad.a(new d(this));
    this.cEh = getIntent().getStringExtra("_RemindDialog_User");
    String str1 = getIntent().getStringExtra("_RemindDialog_Remind");
    this.gSX.clear();
    this.gSX.add(str1);
    Iterator localIterator = gSY.iterator();
    while (localIterator.hasNext())
    {
      String str2 = (String)localIterator.next();
      this.gSX.add(str2);
    }
    this.fav = localad.aRB();
    this.fav.setCanceledOnTouchOutside(false);
    this.fav.show();
    arI();
  }

  public void onPause()
  {
    gSZ = false;
    f localf = (f)bg.qF().eA(f.class.getName());
    if (localf != null)
      localf.b(this.gTa);
    super.onPause();
  }

  public void onResume()
  {
    gSZ = true;
    f localf = (f)bg.qF().eA(f.class.getName());
    if (localf != null)
      localf.a(this.gTa);
    super.onResume();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voicereminder.ui.RemindDialog
 * JD-Core Version:    0.6.2
 */