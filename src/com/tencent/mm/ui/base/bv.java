package com.tencent.mm.ui.base;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.o;

public final class bv extends au
{
  private View eET;
  private ListView erL;
  private BaseAdapter fvx;
  private View hKK;
  private AdapterView.OnItemClickListener hKL;
  private CharSequence jz;
  private TextView kH;
  private Context mContext;

  public bv(Context paramContext)
  {
    super(paramContext, o.cuM);
    this.mContext = paramContext;
    this.eET = View.inflate(this.mContext, k.bix, null);
    this.hKK = this.eET.findViewById(i.aTd);
    this.kH = ((TextView)this.eET.findViewById(i.title));
    this.erL = ((ListView)this.eET.findViewById(i.list));
  }

  public final void a(BaseAdapter paramBaseAdapter)
  {
    this.fvx = paramBaseAdapter;
  }

  public final void dismiss()
  {
    super.dismiss();
  }

  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(this.eET);
  }

  public final void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.hKL = paramOnItemClickListener;
  }

  public final void setTitle(CharSequence paramCharSequence)
  {
    if (paramCharSequence != null)
    {
      this.jz = paramCharSequence;
      return;
    }
    this.jz = null;
  }

  public final void show()
  {
    if ((this.jz == null) || (this.jz.length() == 0))
    {
      this.hKK.setVisibility(8);
      this.kH.setVisibility(8);
    }
    while (true)
    {
      if (this.hKL != null)
        this.erL.setOnItemClickListener(this.hKL);
      if (this.fvx != null)
        this.erL.setAdapter(this.fvx);
      super.show();
      return;
      this.hKK.setVisibility(0);
      this.kH.setVisibility(0);
      this.kH.setText(this.jz);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.bv
 * JD-Core Version:    0.6.2
 */