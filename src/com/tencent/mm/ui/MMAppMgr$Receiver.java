package com.tencent.mm.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.tencent.mm.booter.ak;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelstat.k;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;

public class MMAppMgr$Receiver extends BroadcastReceiver
{
  private MMAppMgr cGK;

  public MMAppMgr$Receiver()
  {
  }

  public MMAppMgr$Receiver(MMAppMgr paramMMAppMgr)
  {
    this.cGK = paramMMAppMgr;
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null);
    do
    {
      do
        return;
      while (bg.qK());
      String str = paramIntent.getAction();
      if ("com.tencent.mm.ui.ACTION_ACTIVE".equals(str))
      {
        MMAppMgr.a(this.cGK, paramIntent, true);
        this.cGK.Y(true);
        return;
      }
      if (!"com.tencent.mm.ui.ACTION_DEACTIVE".equals(str))
        break;
      ak.lB();
      MMAppMgr.a(this.cGK, paramIntent, false);
      this.cGK.Y(false);
    }
    while ((MMAppMgr.aQd() == null) || (MMAppMgr.aQd().length() <= 800));
    new cm(Looper.getMainLooper()).post(new dl(this));
    return;
    if (paramIntent.getAction().equals("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE"))
    {
      if (!paramIntent.getBooleanExtra("intent_extra_is_silence_stat", false))
      {
        int k = paramIntent.getIntExtra("intent_extra_opcode", 0);
        z.d("!32@/B4Tb64lLpINZTHnqdV5XF5PuPz9mv0P", "incremental_update = " + k);
        if (bg.oE())
        {
          n localn3 = n.fTF;
          Object[] arrayOfObject4 = new Object[1];
          arrayOfObject4[0] = Integer.valueOf(k);
          localn3.d(10328, arrayOfObject4);
        }
      }
      long l1;
      long l2;
      while (true)
      {
        l1 = paramIntent.getLongExtra("intent_extra_flow_stat_upstream", 0L);
        l2 = paramIntent.getLongExtra("intent_extra_flow_stat_downstream", 0L);
        boolean bool = paramIntent.getBooleanExtra("intent_extra_flow_stat_is_wifi", false);
        if ((l1 == 0L) && (l2 == 0L))
          break;
        Object[] arrayOfObject2 = new Object[3];
        arrayOfObject2[0] = Long.valueOf(l1);
        arrayOfObject2[1] = Long.valueOf(l2);
        arrayOfObject2[2] = Boolean.valueOf(bool);
        z.d("!32@/B4Tb64lLpINZTHnqdV5XF5PuPz9mv0P", "silence_update_flow_stat upstream %s downstream %s isWifi %s", arrayOfObject2);
        if (!bool)
          break label428;
        k.i((int)l2, (int)l1, 0);
        return;
        int i = paramIntent.getIntExtra("intent_extra_opcode", 0);
        z.d("!32@/B4Tb64lLpINZTHnqdV5XF5PuPz9mv0P", "silence_update_stat = " + i);
        if (bg.oE())
          if (i == 2)
          {
            int j = paramIntent.getIntExtra("intent_extra_install_dialog_times", 0);
            n localn2 = n.fTF;
            Object[] arrayOfObject3 = new Object[2];
            arrayOfObject3[0] = Integer.valueOf(i);
            arrayOfObject3[1] = Integer.valueOf(j);
            localn2.d(11147, arrayOfObject3);
          }
          else
          {
            n localn1 = n.fTF;
            Object[] arrayOfObject1 = new Object[1];
            arrayOfObject1[0] = Integer.valueOf(i);
            localn1.d(11147, arrayOfObject1);
          }
      }
      label428: k.j((int)l2, (int)l1, 0);
      return;
    }
    if (paramIntent.getAction().equals("com.tencent.mm.sandbox.updater.intent.ACTION_EXIT_APP"))
      MMAppMgr.o(paramContext);
    z.e("!32@/B4Tb64lLpINZTHnqdV5XF5PuPz9mv0P", "unknown broadcast action");
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.MMAppMgr.Receiver
 * JD-Core Version:    0.6.2
 */