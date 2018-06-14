package de.fh_zwickau.glasscards;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CardBuilder {

	public enum Layout {
		AUTHOR,
		CAPTION,
		TEXT,
	}

	private Context mContext;
	private LayoutInflater mInflater;
	private Layout mLayout;
	private View mView;

	public CardBuilder(@NonNull Context context, Layout layout) {
		mContext = context;
		mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		mLayout = layout != null ? layout : Layout.TEXT;

		switch (mLayout) {
			case AUTHOR:
				mView = mInflater.inflate(R.layout.card_author, null, false);
				break;
			case CAPTION:
				mView = mInflater.inflate(R.layout.card_caption, null, false);
				break;
			default:
				mView = mInflater.inflate(R.layout.card_text, null, false);
				break;
		}
	}

	public View getView() {
		return mView;
	}

	public CardBuilder setText(String value) {
		((TextView) mView.findViewById(R.id.txt_text)).setText(value);
		return this;
	}

	public CardBuilder setText(int stringResourceId) {
		((TextView) mView.findViewById(R.id.txt_text)).setText(stringResourceId);
		return this;
	}

	public CardBuilder setHeading(String value) {
		((TextView) mView.findViewById(R.id.txt_heading)).setText(value);
		return this;
	}

	public CardBuilder setHeading(int stringResourceId) {
		((TextView) mView.findViewById(R.id.txt_heading)).setText(stringResourceId);
		return this;
	}

	public CardBuilder setSubheading(String value) {
		((TextView) mView.findViewById(R.id.txt_subheading)).setText(value);
		return this;
	}

	public CardBuilder setSubheading(int stringResourceId) {
		((TextView) mView.findViewById(R.id.txt_subheading)).setText(stringResourceId);
		return this;
	}

	public CardBuilder setFootnote(String value) {
		((TextView) mView.findViewById(R.id.txt_footnote)).setText(value);
		return this;
	}

	public CardBuilder setFootnote(int stringResourceId) {
		((TextView) mView.findViewById(R.id.txt_footnote)).setText(stringResourceId);
		return this;
	}

	public CardBuilder setTimestamp(String value) {
		((TextView) mView.findViewById(R.id.txt_timestamp)).setText(value);
		return this;
	}

	public CardBuilder setTimestamp(int stringResourceId) {
		((TextView) mView.findViewById(R.id.txt_timestamp)).setText(stringResourceId);
		return this;
	}

	public CardBuilder setImage(Drawable drawable) {
		((ImageView) mView.findViewById(R.id.img_image)).setImageDrawable(drawable);
		return this;
	}

	public CardBuilder setImage(int drawableResourceId) {
		return this.setImage(mContext.getResources().getDrawable(drawableResourceId));
	}

	public CardBuilder setIcon(Drawable drawable) {
		mView.findViewById(R.id.img_icon).setVisibility(View.VISIBLE);
		((ImageView) mView.findViewById(R.id.img_icon)).setImageDrawable(drawable);
		return this;
	}

	public CardBuilder setIcon(int drawableResourceId) {
		return this.setIcon(mContext.getResources().getDrawable(drawableResourceId));
	}
}
