package com.tencent.mm.ui;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.d.a;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n;
import com.tencent.mm.network.bm;
import com.tencent.mm.o.ac;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.ui.ar;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.base.aa;
import com.tencent.mm.ui.base.ad;

public final class dy
{
  public static boolean a(Context paramContext, int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    switch (paramInt1)
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    }
    label161: a locala;
    do
    {
      return false;
      int k;
      if ((((paramInt3 & 0x2) == 0) || (!bg.qX().tx()) || (!ar.j(paramContext, bg.qX().getNetworkServerIp(), String.valueOf(paramInt2)))) && (((paramInt3 & 0x1) == 0) || (!bm.ab(paramContext)) || (!ar.bl(paramContext))))
        if (((paramInt3 & 0x4) != 0) && (bc.bN(paramContext)))
        {
          if (bg.oE())
            break label161;
          k = 0;
        }
      while (true)
      {
        if (k == 0)
        {
          int j = n.bKj;
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = Integer.valueOf(1);
          arrayOfObject2[1] = Integer.valueOf(paramInt2);
          Toast.makeText(paramContext, paramContext.getString(j, arrayOfObject2), 1).show();
        }
        return true;
        if (ap.b((Boolean)bg.qW().oQ().get(61)))
        {
          k = 0;
        }
        else if (!as.AO("show_wap_adviser"))
        {
          k = 0;
        }
        else
        {
          View localView = View.inflate(paramContext, k.bkp, null);
          ((TextView)localView.findViewById(i.aFY)).setText(n.bUm);
          CheckBox localCheckBox = (CheckBox)localView.findViewById(i.aFX);
          localCheckBox.setText(paramContext.getString(n.bVH));
          localCheckBox.setOnCheckedChangeListener(new dh());
          localCheckBox.setVisibility(0);
          ad localad = new ad(paramContext);
          localad.pn(n.buo);
          localad.ao(localView);
          localad.d(n.bVJ, new di(paramContext));
          localad.eN(false);
          localad.e(n.bVI, null);
          localad.a(new dj());
          localad.aRB().show();
          k = 1;
        }
      }
      int i = n.bKk;
      Object[] arrayOfObject1 = new Object[2];
      arrayOfObject1[0] = Integer.valueOf(2);
      arrayOfObject1[1] = Integer.valueOf(paramInt2);
      Toast.makeText(paramContext, paramContext.getString(i, arrayOfObject1), 1).show();
      return true;
      return true;
      locala = a.ct(paramString);
    }
    while ((locala == null) || (locala.cCB == 4));
    locala.a(paramContext, null, null);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.dy
 * JD-Core Version:    0.6.2
 */