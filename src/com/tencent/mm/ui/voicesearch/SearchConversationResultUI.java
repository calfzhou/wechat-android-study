package com.tencent.mm.ui.voicesearch;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.ui.MMActivity;
import java.util.LinkedList;

public class SearchConversationResultUI extends MMActivity
{
  private TextView ewu;
  private ListView jZu;
  private a jZv;
  private String jZw = null;
  private String username;

  protected final void DP()
  {
    this.jZu = ((ListView)findViewById(com.tencent.mm.i.aWf));
    this.ewu = ((TextView)findViewById(com.tencent.mm.i.arK));
    this.jZv = new a(getApplicationContext(), new g(this));
    if (this.jZv != null)
      this.jZv.bc(new LinkedList());
    this.jZu.setAdapter(this.jZv);
    this.ewu.setVisibility(8);
    this.username = getIntent().getStringExtra("SearchConversationResult_User");
    this.jZw = getIntent().getStringExtra("SearchConversationResult_Error");
    Bt(getString(n.bpe));
    a(new h(this));
    this.jZu.setOnItemClickListener(new i(this));
    String str = this.username;
    this.ewu.setVisibility(8);
    if (this.jZv != null)
      this.jZv.jI(str);
  }

  protected final int getLayoutId()
  {
    return k.bpe;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    DP();
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.jZv.closeCursor();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.voicesearch.SearchConversationResultUI
 * JD-Core Version:    0.6.2
 */