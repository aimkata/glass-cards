package de.fh_zwickau.glasscards;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		View cardText = new CardBuilder(this, CardBuilder.Layout.TEXT)
				.setText(R.string.txt_text)
				.setFootnote(R.string.txt_footnote)
				.setTimestamp(R.string.txt_timestamp)
				.getView();

		View cardTextWithImage = new CardBuilder(this, CardBuilder.Layout.TEXT)
				.setText(R.string.txt_text)
				.setFootnote(R.string.txt_footnote)
				.setTimestamp(R.string.txt_timestamp)
				.setImage(R.drawable.image_a)
				.getView();

		View cardCaption = new CardBuilder(this, CardBuilder.Layout.CAPTION)
				.setText(R.string.txt_text)
				.setFootnote(R.string.txt_footnote)
				.setTimestamp(R.string.txt_timestamp)
				.getView();

		View cardCaptionWithIcon = new CardBuilder(this, CardBuilder.Layout.CAPTION)
				.setText(R.string.txt_text)
				.setFootnote(R.string.txt_footnote)
				.setTimestamp(R.string.txt_timestamp)
				.setIcon(R.drawable.round_favorite_white_24dp)
				.getView();

		View cardCaptionWithImage = new CardBuilder(this, CardBuilder.Layout.CAPTION)
				.setText(R.string.txt_text)
				.setFootnote(R.string.txt_footnote)
				.setTimestamp(R.string.txt_timestamp)
				.setImage(R.drawable.image_b)
				.getView();

		View cardCaptionWithIconAndImage = new CardBuilder(this, CardBuilder.Layout.CAPTION)
				.setText(R.string.txt_text)
				.setFootnote(R.string.txt_footnote)
				.setTimestamp(R.string.txt_timestamp)
				.setIcon(R.drawable.round_favorite_white_24dp)
				.setImage(R.drawable.image_b)
				.getView();

		View cardAuthor = new CardBuilder(this, CardBuilder.Layout.AUTHOR)
				.setText(R.string.txt_text)
				.setFootnote(R.string.txt_footnote)
				.setTimestamp(R.string.txt_timestamp)
				.setHeading(R.string.txt_heading)
				.setSubheading(R.string.txt_subheading)
				.getView();

		View cardAuthorWithIcon = new CardBuilder(this, CardBuilder.Layout.AUTHOR)
				.setText(R.string.txt_text)
				.setFootnote(R.string.txt_footnote)
				.setTimestamp(R.string.txt_timestamp)
				.setHeading(R.string.txt_heading)
				.setSubheading(R.string.txt_subheading)
				.setIcon(R.drawable.round_account_circle_white_24dp)
				.getView();

		View cardAuthorWithImage = new CardBuilder(this, CardBuilder.Layout.AUTHOR)
				.setText(R.string.txt_text)
				.setFootnote(R.string.txt_footnote)
				.setTimestamp(R.string.txt_timestamp)
				.setHeading(R.string.txt_heading)
				.setSubheading(R.string.txt_subheading)
				.setImage(R.drawable.image_c)
				.getView();

		View cardAuthorWithIconAndImage = new CardBuilder(this, CardBuilder.Layout.AUTHOR)
				.setText(R.string.txt_text)
				.setFootnote(R.string.txt_footnote)
				.setTimestamp(R.string.txt_timestamp)
				.setHeading(R.string.txt_heading)
				.setSubheading(R.string.txt_subheading)
				.setIcon(R.drawable.round_account_circle_white_24dp)
				.setImage(R.drawable.image_c)
				.getView();
		setContentView(cardAuthorWithIconAndImage);
	}
}
