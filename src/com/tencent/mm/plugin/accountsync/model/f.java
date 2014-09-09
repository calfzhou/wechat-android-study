package com.tencent.mm.plugin.accountsync.model;

import android.accounts.Account;
import android.accounts.OperationCanceledException;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SyncResult;
import android.os.Bundle;
import android.os.Looper;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.z;

final class f extends AbstractThreadedSyncAdapter
{
  private Context mContext;

  public f(ContactsSyncService paramContactsSyncService, Context paramContext)
  {
    super(paramContext, true);
    this.mContext = paramContext;
  }

  public final void onPerformSync(Account paramAccount, Bundle paramBundle, String paramString, ContentProviderClient paramContentProviderClient, SyncResult paramSyncResult)
  {
    if (!bg.oE())
    {
      z.e("!44@/B4Tb64lLpLSOpQlr7qYXeI8vtsBDwmDryVGH1F6tWw=", "account not ready, ignore this sync");
      return;
    }
    try
    {
      Looper.prepare();
      ContactsSyncService.a(this.dWI, Looper.myLooper());
      ContactsSyncService localContactsSyncService = this.dWI;
      ContactsSyncService.a(localContactsSyncService, paramAccount);
      Looper.loop();
      return;
    }
    catch (OperationCanceledException localOperationCanceledException)
    {
      ContactsSyncService.a(this.dWI);
      z.e("!44@/B4Tb64lLpLSOpQlr7qYXeI8vtsBDwmDryVGH1F6tWw=", "ContactsSyncService.onPerformSync error: " + localOperationCanceledException.getMessage());
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.accountsync.model.f
 * JD-Core Version:    0.6.2
 */