package com.tencent.mm.plugin.exdevice.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.ui.MMActivity;

public class ExdeviceRankInfoUI extends MMActivity
{
  private ListView eLp;
  private a eLq;
  private View eLr;

  protected final void DP()
  {
    String str = getIntent().getStringExtra("key_rank_title");
    if (!ch.jb(str))
      Bt(str);
    while (true)
    {
      a(new e(this));
      this.eLr = findViewById(i.aGv);
      View localView = LayoutInflater.from(this).inflate(k.beD, null, false);
      this.eLp = ((ListView)findViewById(i.asa));
      this.eLp.addHeaderView(localView);
      this.eLq = new a(this, getIntent().getStringExtra("key_rank_info"), getIntent().getStringExtra("key_rank_semi"), new f(this));
      this.eLp.setAdapter(this.eLq);
      return;
      oP(n.bGk);
    }
  }

  protected final int getLayoutId()
  {
    return k.beE;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }

  protected void onDestroy()
  {
    super.onDestroy();
  }

  protected void onPause()
  {
    super.onPause();
  }

  protected void onResume()
  {
    super.onResume();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI
 * JD-Core Version:    0.6.2
 */