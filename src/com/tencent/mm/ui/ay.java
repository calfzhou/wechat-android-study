package com.tencent.mm.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.l;
import android.support.v4.app.v;
import android.view.View;
import com.tencent.mm.i;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.OnLayoutChangedLinearLayout;
import com.tencent.mm.ui.chatting.hd;
import com.tencent.mm.ui.tools.TestTimeForChatting;

final class ay
  implements Runnable
{
  ay(LauncherUI paramLauncherUI)
  {
  }

  public final void run()
  {
    Object[] arrayOfObject = new Object[1];
    boolean bool;
    Intent localIntent;
    if (LauncherUI.r(this.iKj) == null)
    {
      bool = false;
      arrayOfObject[0] = Boolean.valueOf(bool);
      z.i("!32@/B4Tb64lLpKf6BwZaHy6XqYgvUDwrgQ2", "startChatting, ishow:%b", arrayOfObject);
      localIntent = new Intent().putExtra("Chat_User", this.iKj.iKa);
      if (this.iKj.iKb != null)
        localIntent.putExtras(this.iKj.iKb);
      if (LauncherUI.r(this.iKj) == null)
        LauncherUI.a(this.iKj, (TestTimeForChatting)this.iKj.findViewById(i.alc));
      if (LauncherUI.e(this.iKj) != null)
        break label288;
      LauncherUI.a(this.iKj, hd.aVo());
      LauncherUI.e(this.iKj).setArguments(localIntent.getExtras());
      LauncherUI.e(this.iKj).fq(true);
      this.iKj.o().p().a(i.alc, LauncherUI.e(this.iKj)).commitAllowingStateLoss();
      this.iKj.o().executePendingTransactions();
      LauncherUI.a(this.iKj, (OnLayoutChangedLinearLayout)LauncherUI.e(this.iKj).getView().findViewById(i.ali));
      LauncherUI.e(this.iKj).fp(true);
      LauncherUI.e(this.iKj).fo(false);
      LauncherUI.s(this.iKj).a(LauncherUI.t(this.iKj));
      LauncherUI.r(this.iKj).setVisibility(0);
    }
    while (true)
    {
      this.iKj.aPp();
      return;
      bool = LauncherUI.r(this.iKj).isShown();
      break;
      label288: LauncherUI.e(this.iKj).fq(true);
      LauncherUI.e(this.iKj).fo(false);
      LauncherUI.e(this.iKj).getArguments().putAll(localIntent.getExtras());
      LauncherUI.e(this.iKj).aVv();
      LauncherUI.e(this.iKj).onResume();
      LauncherUI.e(this.iKj).fp(true);
      LauncherUI.s(this.iKj).a(LauncherUI.t(this.iKj));
      LauncherUI.r(this.iKj).setVisibility(0);
    }
  }

  public final String toString()
  {
    return super.toString() + "|startChattingRunnable";
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ay
 * JD-Core Version:    0.6.2
 */