import pandas as pd
from sklearn.tree import DecisionTreeClassifier
from sklearn.model_selection import train_test_split
from sklearn.metrics import classification_report, confusion_matrix
from sklearn.model_selection import GridSearchCV
from sklearn.linear_model import LogisticRegression
from sklearn.ensemble import RandomForestClassifier
from sklearn.svm import LinearSVC
from sklearn.svm import OneClassSVM
from sklearn.svm import NuSVC
from sklearn.metrics import accuracy_score
from sklearn.metrics import balanced_accuracy_score
from sklearn.metrics import f1_score
from sklearn.metrics import precision_score
from sklearn.metrics import recall_score
df = pd.read_csv('D:/Donnees/Cours/MIAGE/M2/IDM/MML-classification/org.xtext.example.mml.tests/src/org/xtext/example/mydsl/tests/groupewacquet/resources/iris.csv', sep=',')
features = list(df.columns[:4])
X = df.drop('variety', axis=1)
y = df['variety']
classifier = DecisionTreeClassifier(max_depth=1)
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=20)
classifier.fit(X_train, y_train)
y_pred = classifier.predict(X_test)
text_file = open("src/org/xtext/example/mydsl/tests/groupewacquet/resources/results/pythonfiles/test2.mml.DT.txt", "w")
print("f1_score= " + str(f1_score(y_test, y_pred, average=None)),flush=True)
text_file.write("f1_score= " + str(f1_score(y_test, y_pred, average=None)))
text_file.close()
