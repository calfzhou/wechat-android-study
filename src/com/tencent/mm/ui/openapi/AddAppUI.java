package com.tencent.mm.ui.openapi;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.n;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.q;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.y;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.o;

public class AddAppUI extends MMPreference
  implements m
{
  private o dXi;
  private AppPreference jJO;
  private AppPreference jJP;

  protected final void DP()
  {
    oP(n.brI);
    a(new a(this));
    this.dXi = aTL();
    this.dXi.removeAll();
    this.dXi.addPreferencesFromResource(q.cyX);
    this.jJO = ((AppPreference)this.dXi.BU("addapp_added"));
    this.jJO.qH(1);
    this.jJO.setOnItemClickListener(new b(this));
    this.jJO.a(new c(this));
    this.jJP = ((AppPreference)this.dXi.BU("addapp_available"));
    this.jJP.qH(0);
    this.jJP.setOnItemClickListener(new d(this));
  }

  public final int DZ()
  {
    return q.cyX;
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    z.d("!32@/B4Tb64lLpI1lJSIsVSEEWZzOIvTGa5B", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0))
      return;
    z.e("!32@/B4Tb64lLpI1lJSIsVSEEWZzOIvTGa5B", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
  }

  public final boolean a(o paramo, Preference paramPreference)
  {
    if (paramPreference.getKey().equals("addapp_recommend"))
    {
      SharedPreferences localSharedPreferences = aPI().getSharedPreferences(ak.aHi(), 0);
      aPI();
      String str1 = y.d(localSharedPreferences);
      int i = n.brJ;
      Object[] arrayOfObject = new Object[3];
      arrayOfObject[0] = Integer.valueOf(com.tencent.mm.protocal.a.hrn);
      arrayOfObject[1] = str1;
      arrayOfObject[2] = y.aGV();
      String str2 = getString(i, arrayOfObject);
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", str2);
      com.tencent.mm.am.a.b(this, "webview", ".ui.tools.WebViewUI", localIntent);
      return true;
    }
    return false;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }

  protected void onPause()
  {
    super.onPause();
    if (this.jJO != null)
      this.jJO.onPause();
    if (this.jJP != null)
      this.jJP.onPause();
  }

  protected void onResume()
  {
    super.onResume();
    DP();
    if (this.jJO != null)
      this.jJO.onResume();
    if (this.jJP != null)
      this.jJP.onResume();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.openapi.AddAppUI
 * JD-Core Version:    0.6.2
 */