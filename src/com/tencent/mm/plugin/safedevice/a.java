package com.tencent.mm.plugin.safedevice;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.pluginsdk.c;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.pluginsdk.e;
import com.tencent.mm.ui.MMWizardActivity;

public final class a
  implements e
{
  private static d dWo;
  private static c dWp;

  public static void a(Context paramContext, Intent paramIntent1, Intent paramIntent2)
  {
    dWo.a(paramContext, paramIntent1, paramIntent2);
  }

  public static void b(MMWizardActivity paramMMWizardActivity, Intent paramIntent)
  {
    dWo.b(paramMMWizardActivity, paramIntent);
  }

  public final void a(c paramc)
  {
    dWp = paramc;
  }

  public final void a(d paramd)
  {
    dWo = paramd;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.safedevice.a
 * JD-Core Version:    0.6.2
 */