package com.tencent.mm.console;

import android.content.IntentFilter;
import java.util.HashMap;

public final class Shell
{
  private static HashMap dPw = new HashMap();
  private static IntentFilter dPx = new IntentFilter();
  private static Runnable dPy = new q();
  private Shell.Receiver dPv = null;

  static
  {
    a("wechat.shell.SET_NEXTRET", new j());
    a("wechat.shell.SET_LOGLEVEL", new k());
    a("wechat.shell.SET_CDNTRANS", new l());
    a("wechat.shell.SET_DKTEST", new m());
    a("wechat.shell.NET_DNS_TEST", new n());
    a("wechat.shell.IDC_ERROR", new o());
    a("wechat.shell.SET_DK_WT_TEST", new p());
  }

  private static void a(String paramString, r paramr)
  {
    dPx.addAction(paramString);
    dPw.put(paramString, paramr);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.Shell
 * JD-Core Version:    0.6.2
 */