package json.parser;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import databases.ConnectToMongoDB;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class CnnAPI {
    /*
      You can get API_KEY from this below link. Once you have the API_KEY, you can fetch the top-headlines news.
      https://newsapi.org/s/cnn-api

      my API Key : bd8bf89dada844038a337700e276b203

      Fetch This following CNN API, It will return some news in Json data. Parse this data and construct
      https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=bd8bf89dada844038a337700e276b203

      After getting Json Format of the news, You can go to json validator link: https://jsonlint.com/ to see
      how it can be parsed.

      {"status":"ok","totalResults":10,"articles":[{"source":{"id":"cnn","name":"CNN"},"author":null,"title":"Defeated
      Democrat issues warning to his party - CNN Video","description":"Outgoing Sen. Joe Donnelly (D-IN) offers advice
      to his party and warns against progressive policies such as \"Medicare for all\" when trying to win over red states
      in the 2020 election.","url":"http://us.cnn.com/videos/politics/2018/12/28/joe-donnelly-democrats-2020-progressive-
      medicare-for-all-sot-lead-vpx.cnn","urlToImage":"https://cdn.cnn.com/cnnnext/dam/assets/181228165447-sen-joe-donnelly-
      lead-12-28-18-super-tease.jpg","publishedAt":"2018-12-28T22:08:11.0727926Z","content":"Chat with us in Facebook Messenger.
      Find out what's happening in the world as it unfolds."},{"source":{"id":"cnn","name":"CNN"},"author":null,"title":"Trump
      threatens to close southern border - CNN Video","description":"President Trump threatened to close the US southern
      border \"entirely\" and insisted the federal government would not reopen until he gets his border wall funding.
      CNN's Jessica Dean reports.","url":"http://us.cnn.com/videos/politics/2018/12/28/trump-threatens-to-close-southern-
      border-shutdown-jessica-dean-dnt-lead-vpx.cnn","urlToImage":"https://cdn.cnn.com/cnnnext/dam/assets/181225104619-01-
      trump-1225-super-tease.jpg","publishedAt":"2018-12-28T21:38:31.2724939Z","content":"Chat with us in Facebook Messenger.
      Find out what's happening in the world as it unfolds."},{"source":{"id":"cnn","name":"CNN"},"author":"Ellie Kaufman and Paul
      P. Murphy, CNN","title":"Federal employees prepare for a long shutdown","description":"A quarter of the federal
      government will likely begin the new year out of work or working without pay.","url":"http://us.cnn.com/2018/12/28/
      politics/shutdown-second-week/index.html","urlToImage":"https://cdn.cnn.com/cnnnext/dam/assets/181228115927-01-shutdown-
      capitol-1228-super-tease.jpg","publishedAt":"2018-12-28T21:35:40Z","content":"(CNN) A quarter of the federal government
      will likely begin the new year out of work or working without pay. For the 380,000 federal employees on furlough and
      the other 420,000 working without pay, this means it's time to start making plans for how to pay Jan… [+6670 chars]"},
      {"source":{"id":"cnn","name":"CNN"},"author":"Jamie Ehrlich, CNN","title":"Maine governor deems congressional election
      'stolen' while certifying result","description":"Gov. Paul LePage certified the election results for Maine's 2nd
      Congressional District after a recount and legal battle dragged out the final result in the race for almost two months,
      cementing a Democratic victory.","url":"http://us.cnn.com/2018/12/28/politics/maine-governor-certifies-congressional-
      election/index.html","urlToImage":"https://cdn.cnn.com/cnnnext/dam/assets/161011104302-maine-gov-paul-lepage-super-
      tease.jpg","publishedAt":"2018-12-28T20:36:55Z","content":"Washington (CNN) Gov. Paul LePage certified the election
      results for Maine's 2nd Congressional District after a recount and legal battle dragged out the final result in the
      race for almost two months, cementing a Democratic victory. But, LePage -- a Republica… [+2036 chars]"},{"source":
      {"id":"cnn","name":"CNN"},"author":"Veronica Stracqualursi, CNN","title":"Trump will stay in DC through the shutdown,
      incoming chief of staff says","description":"President Donald Trump has canceled his New Year's plans in order to remain
      in Washington until a deal over border wall funds is reached and the partial government shutdown ends, according to the
      President's incoming acting chief of staff.","url":"http://us.cnn.com/2018/12/28/politics/mick-mulvaney-trump-shutdown-
      plans/index.html","urlToImage":"https://cdn.cnn.com/cnnnext/dam/assets/181214165942-mick-mulvaney-0120-super-tease.jpg",
      "publishedAt":"2018-12-28T17:12:36Z","content":"Washington (CNN) President Donald Trump has canceled his New Year's plans
      in order to remain in Washington until a deal over border wall funds is reached and the partial government shutdown ends,
      according to the President's incoming acting chief of staff. \"T… [+3158 chars]"},{"source":{"id":"cnn","name":"CNN"},
      "author":"Katelyn Polantz, CNN","title":"Court filing in Russian troll farm case references nude selfie","description":
      "A Russian company told a federal court Thursday that it believes that among the terabytes of data collected by special
      counsel Robert Mueller's investigation is a nude selfie.","url":"http://us.cnn.com/2018/12/28/politics/mueller-russian-
      troll-farm-case-selfie/index.html","urlToImage":"https://cdn.cnn.com/cnnnext/dam/assets/180831102823-01-robert-mueller-
      lead-image-super-tease.jpg","publishedAt":"2018-12-28T14:03:40Z","content":null},{"source":{"id":"cnn","name":"CNN"},
      "author":"Ashley Killough, CNN","title":"Shutdown looks set to drag on to 2019 after House and Senate adjourn until
      next week","description":"The House and Senate adjourned Thursday after brief pro forma sessions and made plans to
      reconvene Monday, essentially punting any action to end the partial government shutdown until next week as negotiators
      remain far from an agreement.","url":"http://us.cnn.com/2018/12/27/politics/shutdown-update-thursday/index.html",
      "urlToImage":"https://cdn.cnn.com/cnnnext/dam/assets/181221204335-06-shutdown-capitol-1221-super-tease.jpg",
      "publishedAt":"2018-12-28T11:56:57Z","content":"(CNN) The House and Senate adjourned Thursday after brief pro
      forma sessions and made plans to reconvene Monday, essentially punting any action to end the partial government
      shutdown until next week as negotiators remain far from an agreement. The halls of Co… [+3469 chars]"},{"source":
      {"id":"cnn","name":"CNN"},"author":"Lauren Fox, Jeremy Herb and Manu Raju, CNN","title":"House Democrats scooping
      up staff, lawyers to power Trump investigations","description":"Democrats are quietly preparing for what will likely
      be the largest congressional investigation of a sitting president in recent memory.","url":
      "http://us.cnn.com/2018/12/28/politics/house-democrats-investigations-lawyers-hiring/index.html","urlToImage":
      "https://cdn.cnn.com/cnnnext/dam/assets/181224170548-05-government-shutdown-1224-super-tease.jpg","publishedAt":
      "2018-12-28T11:01:26Z","content":null},{"source":{"id":"cnn","name":"CNN"},"author":"Analysis by Stephen Collinson,
       CNN","title":"Trump's year of chaos in 2018 promises yet another","description":"Throughout 2018, President Donald
       Trump turned the White House and America into a source of instability, unpredictability and disruption.","url":"http:
       //us.cnn.com/2018/12/28/politics/donald-trump-2018-year-in-review/index.html","urlToImage":
       "https://cdn.cnn.com/cnnnext/dam/assets/181220141226-01-donald-trump-oval-office-file-super-tease.jpg","publishedAt":
       "2018-12-28T07:52:41Z","content":null},{"source":{"id":"cnn","name":"CNN"},"author":"Annie Grayer, CNN","title":
       "Mark Meadows says Trump is still 'very firm' on wall as shutdown drags on","description":"House Freedom Caucus
       Chairman Mark Meadows, one of President Donald Trump's closest allies, on Wednesday described Trump's resolve to
       hold out for $5 billion in border wall funding as \"very firm\" as the partial government shutdown entered its
       fifth day.","url":"http://us.cnn.com/2018/12/26/politics/mark-meadow-shutdown-trump-cnntv/index.html","urlToImage":
       "https://cdn.cnn.com/cnnnext/dam/assets/180118173618-mark-meadows-tsr-super-tease.jpg","publishedAt":"2018-12-27T22:
       31:01Z","content":"(CNN) House Freedom Caucus Chairman Mark Meadows, one of President Donald Trump's closest allies,
       on Wednesday described Trump's resolve to hold out for $5 billion in border
      wall funding as \"very firm\" as the partial government shutdown entered its fifth day.… [+2357 chars]"}]}

      "articles": [{
		"source": {
			"id": "cnn",
			"name": "CNN"
		},{}]

	   Read the articles array and construct Headline news as source, author, title,description,url,urlToImage,publishedAt
	   and content. You need to design News Data Model and construct headline news.
	   You can store in Map and then into ArrayList as your choice of Data Structure.

	   You can follow How we implemented in Employee and JsonReaderUtil task.

	   Show output of all the headline news in to console.
	   Store into choice of your database and retrieve.

     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        String sURL = "https://newsapi.org/v2/top-headlines?sources=cnn&apiKey=bd8bf89dada844038a337700e276b203";
        HelperClass methods = null;
        List<HelperClass> newsList = new ArrayList<>();
        URL url = new URL(sURL);
        URLConnection request = url.openConnection();
        request.connect();
        JsonArray jsonArray = null;
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject xd = new JsonObject();
        xd.add("articles", root);
        //Create ConnectToSqlDB Object
        ConnectToMongoDB connectToMongoDB = new ConnectToMongoDB();

        jsonArray = new JsonArray();
        jsonArray.add(root.getAsJsonObject().get("articles"));


        for (int i = 0; i < jsonArray.get(0).getAsJsonArray().size(); i++) {
            try {
                JsonObject jsonobject = jsonArray.get(0).getAsJsonArray().get(i).getAsJsonObject();

                String source = jsonobject.get("source").getAsJsonObject().get("id").toString();
                String author = jsonobject.get("author").toString();
                String title = jsonobject.get("title").toString();
                String description = jsonobject.get("description").toString();
                String u = jsonobject.get("url").toString();
                String urlToImage = jsonobject.get("urlToImage").toString();
                String publisherAt = jsonobject.get("publishedAt").toString();
                String content = jsonobject.get("content").toString();

                methods = new HelperClass(source, author, title, description, u, urlToImage, publisherAt, content);

                newsList.add(methods);

            } catch (Exception ex) {
            }
        }

        //Print to the console.
        for (HelperClass entry : newsList) {
            System.out.println( entry.getTitle());
        }

        connectToMongoDB.newInsertIntoMongoDB(newsList, "CNNApi");
        // print form data base to console
        List<HelperClass> st1List = connectToMongoDB.newReadListFromMongoDB(newsList, "CNNApi");
        for (HelperClass entry : st1List) {
            System.out.println( entry.getTitle());
        }
        // // + " " + entry.getDescription() + " " + entry.getUrl() + " " + entry.getUrlToImage() + " " + entry.getPublisherAt() + " " + entry.getContent());
       // entry.getSource() + " " + entry.getAuthor() + " " +
        // entry.getSource() + " " + entry.getAuthor() + " " +
    }
}
