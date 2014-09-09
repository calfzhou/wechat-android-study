package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ListView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.VerticalScrollBar;
import com.tencent.mm.ui.base.fy;
import com.tencent.mm.z.a;
import com.tencent.mm.z.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountryCodeUI extends MMActivity
{
  private String dWU = "";
  private String dmj;
  private String dyU;
  private fj fqB;
  private fy fqC;
  private List gfe;
  private ListView jPg;
  private y jPh;
  private VerticalScrollBar jPi;

  protected final void DP()
  {
    oP(n.bsx);
    z.d("!32@/B4Tb64lLpJaBzAUU/apZElCm+mODGXP", "CHT:initCountryCode start:" + System.currentTimeMillis());
    String[] arrayOfString1 = getString(n.aoW).trim().split(",");
    if (!b.yt())
    {
      for (int k = 0; k < arrayOfString1.length; k++)
      {
        String[] arrayOfString3 = arrayOfString1[k].trim().split(":");
        this.gfe.add(new x(arrayOfString3[1], arrayOfString3[0], arrayOfString3[2].charAt(0), arrayOfString3[2]));
      }
      Collections.sort(this.gfe, new aa(this));
      this.fqB = new fj(true, true);
      this.fqB.a(new ac(this));
      a(this.fqB);
      this.jPg = ((ListView)findViewById(i.aeA));
      this.jPh = new y(this, this.gfe);
      this.jPg.setAdapter(this.jPh);
      this.jPg.setVisibility(0);
      this.jPi = ((VerticalScrollBar)findViewById(i.aeL));
      if (b.yt())
        break label439;
    }
    label439: for (this.fqC = new ad(this); ; this.fqC = new ae(this))
    {
      this.jPi.a(this.fqC);
      a(new af(this));
      this.jPg.setOnItemClickListener(new ag(this));
      return;
      z.d("!32@/B4Tb64lLpJaBzAUU/apZElCm+mODGXP", "CHT:initCountryCode t1:" + System.currentTimeMillis());
      for (int i = 0; i < arrayOfString1.length; i++)
      {
        String[] arrayOfString2 = arrayOfString1[i].trim().split(":");
        int j = a.gW(arrayOfString2[1]);
        this.gfe.add(new x(arrayOfString2[1], arrayOfString2[0], j, arrayOfString2[1]));
      }
      z.d("!32@/B4Tb64lLpJaBzAUU/apZElCm+mODGXP", "CHT:initCountryCode t2:" + System.currentTimeMillis());
      Collections.sort(this.gfe, new ab(this));
      z.d("!32@/B4Tb64lLpJaBzAUU/apZElCm+mODGXP", "CHT2:initCountryCode t3:" + System.currentTimeMillis());
      break;
    }
  }

  protected final int getLayoutId()
  {
    if (b.yt())
      return k.bdW;
    return k.bdV;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.gfe = new ArrayList();
    this.dyU = ap.Y(getIntent().getStringExtra("country_name"), "");
    this.dmj = ap.Y(getIntent().getStringExtra("couttry_code"), "");
    DP();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("country_name", this.dyU);
      localIntent.putExtra("couttry_code", this.dmj);
      setResult(100, localIntent);
      finish();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }

  protected void onPause()
  {
    super.onPause();
    if (this.fqB != null)
      this.fqB.baN();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.CountryCodeUI
 * JD-Core Version:    0.6.2
 */