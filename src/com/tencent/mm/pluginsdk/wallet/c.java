package com.tencent.mm.pluginsdk.wallet;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.am.a;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.cf;

public final class c
{
  public static boolean a(Context paramContext, int paramInt, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("scene", paramInt);
    localIntent.putExtra("receiver_name", paramString);
    a.b(paramContext, "remittance", ".ui.RemittanceAdapterUI", localIntent);
    return true;
  }

  public static boolean a(Context paramContext, PayInfo paramPayInfo, int paramInt)
  {
    Intent localIntent = new Intent();
    if ((2 == paramPayInfo.hMM) || (1 == paramPayInfo.hMM) || (4 == paramPayInfo.hMM))
    {
      paramPayInfo.hMN = false;
      if ((paramPayInfo.hMM != 4) && (paramPayInfo.hMM != 1))
        break label86;
    }
    label86: for (paramPayInfo.hMO = true; ; paramPayInfo.hMO = false)
    {
      localIntent.putExtra("key_pay_info", paramPayInfo);
      a.a(paramContext, "wallet", ".pay.ui.WalletLauncherUI", localIntent, paramInt);
      return true;
      paramPayInfo.hMN = true;
      break;
    }
  }

  public static boolean a(Context paramContext, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    if (ch.jb(paramString1))
      return false;
    PayInfo localPayInfo = new PayInfo();
    localPayInfo.hjf = paramString1;
    localPayInfo.appId = paramString2;
    localPayInfo.hma = null;
    localPayInfo.hMM = paramInt1;
    localPayInfo.cGy = null;
    localPayInfo.dIu = 0;
    return a(paramContext, localPayInfo, paramInt2);
  }

  public static boolean a(MMActivity paramMMActivity, b paramb, int paramInt, cf paramcf)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("appId", paramb.appId);
    localIntent.putExtra("timeStamp", paramb.hMV);
    localIntent.putExtra("nonceStr", paramb.hMU);
    localIntent.putExtra("packageExt", paramb.hMW);
    localIntent.putExtra("signtype", paramb.hMT);
    localIntent.putExtra("paySignature", paramb.hMX);
    localIntent.putExtra("url", paramb.url);
    localIntent.putExtra("key_bind_scene", paramb.hML);
    paramMMActivity.a(paramcf);
    a.a(paramMMActivity, "wallet", ".bind.ui.WalletBindUI", localIntent, paramInt, false);
    return true;
  }

  public static boolean bp(Context paramContext)
  {
    a.l(paramContext, "wallet", ".balance.ui.WalletBalanceManagerUI");
    return true;
  }

  public static boolean s(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("key_bind_scene", 5);
    localIntent.putExtra("key_offline_add_fee", paramInt);
    a.b(paramContext, "wallet", ".bind.ui.WalletBindUI", localIntent);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.wallet.c
 * JD-Core Version:    0.6.2
 */