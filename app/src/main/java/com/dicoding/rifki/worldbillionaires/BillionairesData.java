package com.dicoding.rifki.worldbillionaires;

import java.util.ArrayList;

public class BillionairesData {
    public static String[][] data = new String[][]{
            {"Jeff Bezos & family", "CEO and Founder of Amazon", "$131B", "https://specials-images.forbesimg.com/imageserve/5bb22ae84bbe6f67d2e82e05/416x416.jpg?background=000000&cropX1=904&cropX2=1403&cropY1=262&cropY2=761", "55","United States", "- Jeff Bezos founded e-commerce colossus Amazon in 1994 out of his garage in Seattle. He remains CEO and owns a 16% stake.\n" +
                    "- He and his wife, MacKenzie, who are divorcing after 25 years of marriage, announced in April that he will transfer 4% of Amazon to her.\n" +
                    "- When the divorce goes through, likely in July, MacKenzie will get tens of billions worth of Amazon stock, making her one of the world's richest women.\n" +
                    "- In 2018, Amazon pulled in $230 billion in revenues and a record $10 billion in net profit, up from $3 billion the prior year.\n" +
                    "- In February, Amazon announced it was canceling plans for a second headquarters in Long Island City, New York after local lawmakers opposed the plan.\n" +
                    "- Bezos owns The Washington Post and Blue Origin, an aerospace company that is developing a rocket for commercial use."},
            {"Bill Gates", "Cofounder of Bill & Melinda Gates Foundation", "$96.5B", "https://specials-images.forbesimg.com/imageserve/5c76b4b84bbe6f24ad99c370/416x416.jpg?background=000000&cropX1=0&cropX2=4000&cropY1=0&cropY2=4000", "63", "United States", "- With his wife Melinda, Bill Gates chairs the Bill & Melinda Gates Foundation, the world's largest private charitable foundation.\n" +
                    "- The foundation works to save lives and improve global health, and is working with Rotary International to eliminate polio.\n" +
                    "- Gates has sold or given away much of his stake in Microsoft -- he owns just over 1% of shares --and invested in a mix of stocks and other assets.\n" +
                    "- He remains a board member of Microsoft, the software firm he founded with Paul Allen in 1975.\n" +
                    "- In late 2016, Gates announced the launch of a $1 billion Breakthrough Energy investment fund with about 20 other people.\n" +
                    "- To date, Gates has donated $35.8 billion worth of Microsoft stock to the Gates Foundation."},
            {"Warren Buffett", "CEO of Berkshire Hathaway", "$82.5B", "https://specials-images.forbesimg.com/imageserve/5babb7f1a7ea4342a948b79a/416x416.jpg?background=000000&cropX1=1406&cropX2=2442&cropY1=1827&cropY2=2864", "88", "United States", "- Known as the \"Oracle of Omaha,\" Warren Buffett is one of the most successful investors of all time.\n" +
                    "- Buffett runs Berkshire Hathaway, which owns more than 60 companies, including insurer Geico, battery maker Duracell and restaurant chain Dairy Queen.\n" +
                    "- The son of a U.S. congressman, he first bought stock at age 11 and first filed taxes at age 13.\n" +
                    "- He's promised to give away over 99% of his fortune. In 2018 he donated $3.4 billion, much of it to the foundation of friends Bill and Melinda Gates.\n" +
                    "- In 2010, he and Gates launched the Giving Pledge, asking billionaires to commit to donating half their wealth to charitable causes."},
            {"Bernard Arnault & family", "Chairman and CEO of LVMH Moet Hennessy Louis Vuitton", "$76B", "https://specials-images.forbesimg.com/imageserve/5c76b6cf31358e35dd277355/416x416.jpg?background=000000&cropX1=0&cropX2=3000&cropY1=0&cropY2=3000", "70", "France", "- One of the world's ultimate taste-makers, Bernard Arnault oversees an empire of 70 brands including Louis Vuitton and Sephora.\n" +
                    "- His luxury goods group, LVMH, posted record sales and profits in 2018, thanks in part to increased spending by Chinese customers.\n" +
                    "- The arts patron is the visionary behind the $135 million Frank Gehry-designed Foundation Louis Vuitton museum near Paris, opened in 2014.\n" +
                    "- Arnault and LVMH pledged over $220 million to help repair the Notre Dame cathedral in Paris following a devastating fire in mid April 2019.\n" +
                    "- His daughter Delphine is executive vice president of Louis Vuitton, and a member of LVMH's executive committee.\n" +
                    "- His father made a small fortune in construction; Arnault put up $15 million from that business to buy Christian Dior in 1985."},
            {"Carlos Slim Helu & family", "Honorary Chairman of América Móvil", "$64B", "https://specials-images.forbesimg.com/imageserve/5c76ba144bbe6f24ad99c613/416x416.jpg?background=000000&cropX1=0&cropX2=3005&cropY1=389&cropY2=3395", "79", "Mexico", "- Mexico's richest man, Carlos Slim Helu and his family control America Movil, Latin America's biggest mobile telecom firm.\n" +
                    "- With foreign telecom partners, Slim bought a stake in Telmex, Mexico's only phone company, in 1990. Telmex is now part of America Movil.\n" +
                    "- He also owns stakes in Mexican construction, consumer goods, mining and real estate companies and 17% of The New York Times.\n" +
                    "- His son-in-law Fernando Romero designed the Soumaya Museum in Mexico City, home to Slim's extensive, eclectic art collection."},
            {"Amancio Ortega", "Zara", "$62.7B", "https://specials-images.forbesimg.com/imageserve/5c76b94131358e35dd27748e/416x416.jpg?background=000000&cropX1=549&cropX2=1878&cropY1=275&cropY2=1604", "83", "Spain", "- Amancio Ortega is one of the richest men in Europe and the wealthiest retailer in the world.\n" +
                    "- A pioneer in fast fashion, he cofounded Inditex, known for its Zara fashion chain, with his ex-wife Rosalia Mera (d. 2013) in 1975.\n" +
                    "- He owns about 60% of Madrid-listed Inditex, which has 8 brands, including Massimo Dutti and Pull & Bear, and 7,500 stores around the world.\n" +
                    "- Ortega typically earns more than $400 million in dividends a year.\n" +
                    "- He has invested his dividends primarily into real estate in Madrid, Barcelona, London, Chicago, Miami and New York."},
            {"Larry Ellison", "CTO and Founder of Oracle", "$62.5B", "https://specials-images.forbesimg.com/imageserve/5c76bb794bbe6f24ad99c660/416x416.jpg?background=000000&cropX1=124&cropX2=2336&cropY1=219&cropY2=2430", "74", "United States", "- Larry Ellison cofounded software firm Oracle in 1977 to tap into the growing need for customer relationship management databases.\n" +
                    "- He gave up the Oracle CEO role in 2014 but still serves as chairman of the board and chief technology officer.\n" +
                    "- As part of Oracle's push into cloud computing, it acquired cloud-software firm Netsuite for $9.3 billion in 2016.\n" +
                    "- In May 2016, Ellison pledged $200 million to the University of Southern California for a cancer treatment center.\n" +
                    "- In March 2018, Ellison launched a wellness startup called Sensei, whose first project is hydroponic farming on the Hawaiian island Lanai.\n" +
                    "- Ellison joined Tesla's board in December 2018, after purchasing 3 million Tesla shares earlier that year."},
            {"Mark Zuckerberg", "Cofounder, Chairman and CEO of Facebook", "$62.3B", "https://specials-images.forbesimg.com/imageserve/5c76b7d331358e35dd2773a9/416x416.jpg?background=000000&cropX1=0&cropX2=4401&cropY1=0&cropY2=4401", "35", "United States", "- After facing another year of criticism for fake news and abuse on Facebook, CEO Mark Zuckerberg said his priority in 2019 is tackling social issues.\n" +
                    "- In April 2018, he testified before Congress after it was revealed that Facebook shared users' data with political consulting firm Cambridge Analytica.\n" +
                    "- Zuckerberg started Facebook at Harvard in 2004 at the age of 19 for students to match names with faces in class.\n" +
                    "- He took Facebook public in May 2012 and still owns about 15% of the stock.\n" +
                    "- In December 2015, Zuckerberg and his wife, Priscilla Chan, pledged to give away 99% of their Facebook stake over their lifetimes."},
            {"Michael Bloomberg", "CEO of Bloomberg", "$55.5B", "https://specials-images.forbesimg.com/imageserve/5c76b4104bbe6f24ad99c35d/416x416.jpg?background=000000&cropX1=882&cropX2=5003&cropY1=585&cropY2=4706", "77", "United States", "- Michael Bloomberg cofounded financial information and media company Bloomberg LP in 1981.\n" +
                    "- He put in the seed funding for the company and now owns 88% of the business, which has revenues north of $9 billion.\n" +
                    "- Bloomberg got his start on Wall Street in 1966 with an entry level job at investment bank Salomon Brothers. He was fired 15 years later.\n" +
                    "- An active philanthropist, he has donated more than $5 billion to gun control, climate change and other causes.\n" +
                    "- He plans to spend at least $500 million to defeat Donald Trump in 2020."},
            {"Larry Page", "CEO of Alphabet", "$50.8B", "https://specials-images.forbesimg.com/imageserve/5c76bcaaa7ea43100043c836/416x416.jpg?background=000000&cropX1=387&cropX2=1729&cropY1=118&cropY2=1460", "46", "United States", "- Larry Page sits at the helm of Alphabet, the parent company of Google, healthcare division Calico, smart home appliance division Nest and more.\n" +
                    "- He cofounded Google in 1998 with fellow Stanford Ph.D. student Sergey Brin.\n" +
                    "- With Brin, Page invented Google's PageRank algorithm, which powers the search engine.\n" +
                    "- Page was Google's first CEO until 2001. After serving as president of products, he took the CEO job again in 2011."}
    };

    public static ArrayList<Billionaires> getListData(){
        Billionaires billionaires = null;
        ArrayList<Billionaires> list = new ArrayList<>();
        for (String[] aData : data) {
            billionaires = new Billionaires();
            billionaires.setName(aData[0]);
            billionaires.setCompany(aData[1]);
            billionaires.setMoney(aData[2]);
            billionaires.setPhoto(aData[3]);
            billionaires.setAge(aData[4]);
            billionaires.setCitizenship(aData[5]);
            billionaires.setDescription(aData[6]);

            list.add(billionaires);
        }
        return list;
    }
}
